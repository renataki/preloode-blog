package com.preloode.blog.model.transaction;

import com.preloode.blog.model.company.CompanyBranchListReference;
import com.preloode.blog.model.company.CompanyListReference;
import com.preloode.blog.model.global.Base;
import com.preloode.blog.model.global.TimestampReference;
import org.springframework.data.mongodb.core.index.Indexed;

import java.math.BigDecimal;
import java.util.List;


public class TransactionCart extends Base {


    private TransactionActionReference action;

    @Indexed
    private BigDecimal amount;

    @Indexed
    private BigDecimal amountPromotion;

    private CompanyBranchListReference branch;

    private CompanyListReference company;

    private List<String> imageList;

    private TransactionShopProductReference product;

    private String reference;

    @Indexed
    private BigDecimal serviceCharge;

    @Indexed
    private BigDecimal tax;


    public TransactionCart() {


    }


    public TransactionCart(String id, TimestampReference created, TimestampReference modified, TransactionActionReference action, BigDecimal amount, BigDecimal amountPromotion, CompanyBranchListReference branch, CompanyListReference company, List<String> imageList, TransactionShopProductReference product, String reference, BigDecimal serviceCharge, BigDecimal tax) {

        super(id, created, modified);
        this.action = action;
        this.amount = amount;
        this.amountPromotion = amountPromotion;
        this.branch = branch;
        this.company = company;
        this.imageList = imageList;
        this.product = product;
        this.reference = reference;
        this.serviceCharge = serviceCharge;
        this.tax = tax;

    }


    public TransactionActionReference getAction() {

        return action;

    }


    public void setAction(TransactionActionReference action) {

        this.action = action;

    }


    public BigDecimal getAmount() {

        return amount;

    }


    public void setAmount(BigDecimal amount) {

        this.amount = amount;

    }


    public BigDecimal getAmountPromotion() {

        return amountPromotion;

    }


    public void setAmountPromotion(BigDecimal amountPromotion) {

        this.amountPromotion = amountPromotion;

    }


    public CompanyBranchListReference getBranch() {

        return branch;

    }


    public void setBranch(CompanyBranchListReference branch) {

        this.branch = branch;

    }


    public CompanyListReference getCompany() {

        return company;

    }


    public void setCompany(CompanyListReference company) {

        this.company = company;

    }


    public List<String> getImageList() {

        return imageList;

    }


    public void setImageList(List<String> imageList) {

        this.imageList = imageList;

    }


    public TransactionShopProductReference getProduct() {

        return product;

    }


    public void setProduct(TransactionShopProductReference product) {

        this.product = product;

    }


    public String getReference() {

        return reference;

    }


    public void setReference(String reference) {

        this.reference = reference;

    }


    public BigDecimal getServiceCharge() {

        return serviceCharge;

    }


    public void setServiceCharge(BigDecimal serviceCharge) {

        this.serviceCharge = serviceCharge;

    }


    public BigDecimal getTax() {

        return tax;

    }


    public void setTax(BigDecimal tax) {

        this.tax = tax;

    }


}
