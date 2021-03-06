package com.preloode.blog.controller.shop;

import com.preloode.blog.component.FileComponent;
import com.preloode.blog.configuration.global.GlobalConfiguration;
import com.preloode.blog.enumeration.global.FileSize;
import com.preloode.blog.model.global.BaseResponse;
import com.preloode.blog.model.global.FileResponse;
import com.preloode.blog.model.shop.ShopProduct;
import com.preloode.blog.model.shop.ShopProductResponse;
import com.preloode.blog.model.user.User;
import com.preloode.blog.service.shop.ShopProductService;
import com.preloode.blog.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


@Controller
@RequestMapping(value = "/shop/product")
public class ShopProductController {


    private static final Logger logger = LoggerFactory.getLogger(ShopProductController.class);

    @Autowired
    private GlobalConfiguration global;

    @Autowired
    private FileComponent file;

    @Autowired
    private ShopProductService shopProductService;

    @Autowired
    private UserService userService;

    private User account;

    private int page;


    @ModelAttribute("account")
    public User account(HttpServletRequest request, HttpServletResponse response) {

        userService.checkAccess(response);

        account = userService.initializeAccount(request);

        return account;

    }


    @ModelAttribute("global")
    public GlobalConfiguration global(HttpServletRequest request) {

        global.initializeSetting(request, "Shop Product");

        return global;

    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(HttpServletRequest request, Model model) {

        String checkLogin = userService.checkLogin(request);

        if(!checkLogin.isEmpty()) {

            BaseResponse checkPrivilege = userService.checkPrivilege("view", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                page = 1;

                ShopProductResponse shopProductPagination = shopProductService.loadPagination(request, account, Sort.Direction.DESC, "created.timestamp", page);

                if(shopProductPagination.isResult()) {

                    model.addAttribute("link", shopProductPagination.getLink());
                    model.addAttribute("page", page);
                    model.addAttribute("pagination", shopProductPagination.getShopProductList());

                }

                logger.info("Shop product page initialized");

                return "shop/product";

            }

            logger.info("Error restricted access initialized");

            return "restricted-access";

        }

        logger.info("Redirected to login page");

        return "redirect:/login/";

    }


    @RequestMapping(value = "/{page:page-[\\d]}", method = RequestMethod.GET)
    public String page(HttpServletRequest request, @PathVariable("page") String pagePath, Model model) {

        String checkLogin = userService.checkLogin(request);

        if(!checkLogin.isEmpty()) {

            BaseResponse checkPrivilege = userService.checkPrivilege("view", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                page = Integer.parseInt(pagePath.replaceAll("[^0-9]", ""));

                ShopProductResponse shopProductPagination = shopProductService.loadPagination(request, account, Sort.Direction.DESC, "created.timestamp", page);

                if(shopProductPagination.isResult()) {

                    model.addAttribute("link", shopProductPagination.getLink());
                    model.addAttribute("page", page);
                    model.addAttribute("pagination", shopProductPagination.getShopProductList());

                }

                logger.info("Shop product page initialized");

                return "shop/product";

            }

            logger.info("Error restricted access initialized");

            return "restricted-access";

        }

        logger.info("Redirected to login page");

        return "redirect:/login/";

    }


    @RequestMapping(value = "/entry", method = RequestMethod.GET)
    public String add(HttpServletRequest request, Model model) {

        String checkLogin = userService.checkLogin(request);

        if(!checkLogin.isEmpty()) {

            BaseResponse checkPrivilege = userService.checkPrivilege("add", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                model.addAttribute("entry", new ShopProduct());

                logger.info("Shop product entry page initialized");

                return "shop/product-entry";

            }

            logger.info("Error restricted access initialized");

            return "restricted-access";

        }

        logger.info("Redirected to login page");

        return "redirect:/login/";

    }


    @RequestMapping(value = "/entry/{id}", method = RequestMethod.GET)
    public String edit(HttpServletRequest request, @PathVariable("id") String id, Model model) {

        String checkLogin = userService.checkLogin(request);

        if(!checkLogin.isEmpty()) {

            BaseResponse checkPrivilege = userService.checkPrivilege("edit", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                model.addAttribute("entry", shopProductService.loadEntry(id.replaceAll("[^A-Za-z0-9]", "")));

                logger.info("Shop product entry page initialized");

                return "shop/product-entry";

            }

            logger.info("Error restricted access initialized");

            return "restricted-access";

        }

        logger.info("Redirected to login page");

        return "redirect:/login/";

    }


    @RequestMapping(value = "/initialize-pagination")
    @ResponseBody
    public ShopProductResponse initializePagination(HttpServletRequest request) {

        ShopProductResponse result = new ShopProductResponse() {
            {
                setResponse("Failed to initialize shop product pagination");
                setResult(false);
            }
        };

        if(account.getUsername() != null) {

            BaseResponse checkPrivilege = userService.checkPrivilege("view", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                result = shopProductService.initializePagination(request, account, page);

            } else {

                result.setResponse("User privilege denied");

            }

        } else {

            result.setResponse("Session expired");

        }

        logger.info(result.getResponse());

        return result;

    }


    @RequestMapping(value = "/filter-pagination")
    @ResponseBody
    public BaseResponse filterPagination(HttpServletResponse response, @RequestBody Map<String, Object> filter) {

        BaseResponse result = new BaseResponse(
                "Failed to filter shop product pagination",
                false
        );

        if(account.getUsername() != null) {

            BaseResponse checkPrivilege = userService.checkPrivilege("view", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                result = shopProductService.filterPagination(response, account, filter);

            } else {

                result.setResponse("User privilege denied");

            }

        } else {

            result.setResponse("Session expired");

        }

        logger.info(result.getResponse());

        return result;

    }


    @RequestMapping(value = "/set-pagination")
    @ResponseBody
    public BaseResponse setPagination(HttpServletResponse response, @RequestBody int pagination) {

        BaseResponse result = new BaseResponse(
                "Failed to set shop product pagination",
                false
        );

        if(account.getUsername() != null) {

            BaseResponse checkPrivilege = userService.checkPrivilege("view", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                result = shopProductService.setPagination(response, account, pagination);

            } else {

                result.setResponse("User privilege denied");

            }

        } else {

            result.setResponse("Session expired");

        }

        logger.info(result.getResponse());

        return result;

    }


    @RequestMapping(value = "/remove-filter-pagination")
    @ResponseBody
    public BaseResponse removeFilterPagination(HttpServletRequest request, HttpServletResponse response) {

        BaseResponse result = new BaseResponse(
                "Failed to remove filter shop product pagination",
                false
        );

        if(account.getUsername() != null) {

            BaseResponse checkPrivilege = userService.checkPrivilege("view", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                result = shopProductService.removeFilterPagination(request, response, account);

            } else {

                result.setResponse("User privilege denied");

            }

        } else {

            result.setResponse("Session expired");

        }

        logger.info(result.getResponse());

        return result;

    }


    @RequestMapping(value = "/initialize-data")
    @ResponseBody
    public ShopProductResponse initializeData(@RequestBody String id) {

        ShopProductResponse result = new ShopProductResponse() {
            {
                setResponse("Failed to initialize shop product data");
                setResult(false);
            }
        };

        if(account.getUsername() != null) {

            BaseResponse checkPrivilege = userService.checkPrivilege("view", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                result = shopProductService.initializeData(account, id);

            } else {

                result.setResponse("User privilege denied");

            }

        } else {

            result.setResponse("Session expired");

        }

        logger.info(result.getResponse());

        return result;

    }


    @RequestMapping(value = "/upload-image-list")
    @ResponseBody
    public FileResponse uploadImageList(MultipartHttpServletRequest multipartRequest) {

        FileResponse result = new FileResponse() {
            {
                setResponse("Failed to upload shop product image list");
                setResult(false);
            }
        };

        if(account.getUsername() != null) {

            BaseResponse checkPrivilege = userService.checkPrivilege("view", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                result = file.uploadResizeImage(multipartRequest, FileSize.Large, "/shop/product");

            } else {

                result.setResponse("User privilege denied");

            }

        } else {

            result.setResponse("Session expired");

        }

        logger.info(result.getResponse());

        return result;

    }


    @RequestMapping(value = "/upload-thumbnail-list")
    @ResponseBody
    public FileResponse uploadThumbnailList(MultipartHttpServletRequest multipartRequest) {

        FileResponse result = new FileResponse() {
            {
                setResponse("Failed to upload shop product thumbnail list");
                setResult(false);
            }
        };

        if(account.getUsername() != null) {

            BaseResponse checkPrivilege = userService.checkPrivilege("view", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                result = file.uploadResizeImage(multipartRequest, FileSize.Medium, "/shop/product/thumbnail");

            } else {

                result.setResponse("User privilege denied");

            }

        } else {

            result.setResponse("Session expired");

        }

        logger.info(result.getResponse());

        return result;

    }


    @RequestMapping(value = "/upload-tinymce")
    @ResponseBody
    public FileResponse uploadTinymce(MultipartHttpServletRequest multipartRequest) {

        FileResponse result = new FileResponse() {
            {
                setResponse("Failed to upload shop product tinymce");
                setResult(false);
            }
        };

        if(account.getUsername() != null) {

            BaseResponse checkPrivilege = userService.checkPrivilege("view", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                result = file.uploadResizeTinymceImage(multipartRequest, "/shop/product/tinymce");

            } else {

                result.setResponse("User privilege denied");

            }

        } else {

            result.setResponse("Session expired");

        }

        logger.info(result.getResponse());

        return result;

    }


    @RequestMapping(value = "/insert")
    @ResponseBody
    public BaseResponse insert(HttpServletRequest request, @RequestBody ShopProduct shopProduct) {

        BaseResponse result = new BaseResponse(
                "Failed to insert shop product",
                false
        );

        if(account.getUsername() != null) {

            BaseResponse checkPrivilege = userService.checkPrivilege("add", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                result = shopProductService.insert(request, account, shopProduct);

            } else {

                result.setResponse("User privilege denied");

            }

        } else {

            result.setResponse("Session expired");

        }

        logger.info(result.getResponse());

        return result;

    }


    @RequestMapping(value = "/update")
    @ResponseBody
    public BaseResponse update(HttpServletRequest request, @RequestBody ShopProduct shopProduct) {

        BaseResponse result = new BaseResponse(
                "Failed to update shop product",
                false
        );

        if(account.getUsername() != null) {

            BaseResponse checkPrivilege = userService.checkPrivilege("edit", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                result = shopProductService.update(request, account, shopProduct);

            } else {

                result.setResponse("User privilege denied");

            }

        } else {

            result.setResponse("Session expired");

        }

        logger.info(result.getResponse());

        return result;

    }


    @RequestMapping(value = "/delete")
    @ResponseBody
    public BaseResponse delete(HttpServletRequest request, @RequestBody String id) {

        BaseResponse result = new BaseResponse(
                "Failed to delete shop product",
                false
        );

        if(account.getUsername() != null) {

            BaseResponse checkPrivilege = userService.checkPrivilege("delete", account.getPrivilege().getShopProduct());

            if(checkPrivilege.isResult()) {

                result = shopProductService.delete(request, account, id);

            } else {

                result.setResponse("User privilege denied");

            }

        } else {

            result.setResponse("Session expired");

        }

        logger.info(result.getResponse());

        return result;

    }


}
