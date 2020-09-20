package com.preloode.blog.repository.global;

import com.preloode.blog.configuration.data.MongodbConfiguration;
import com.preloode.blog.model.company.Company;
import com.preloode.blog.model.company.CompanyBranch;
import com.preloode.blog.model.company.CompanyBranchLogData;
import com.preloode.blog.model.company.CompanyLogData;
import com.preloode.blog.model.cryptocurrency.CryptocurrencyAsset;
import com.preloode.blog.model.cryptocurrency.CryptocurrencyTriangularArbitrage;
import com.preloode.blog.model.cryptocurrency.binance.CryptocurrencyBinanceAveragePriceTicker;
import com.preloode.blog.model.cryptocurrency.binance.CryptocurrencyBinanceExchangeInformation;
import com.preloode.blog.model.cryptocurrency.bitfinex.CryptocurrencyBitfinexSymbolDetail;
import com.preloode.blog.model.cryptocurrency.bittrex.CryptocurrencyBittrexCurrency;
import com.preloode.blog.model.cryptocurrency.kraken.CryptocurrencyKrakenAssetPair;
import com.preloode.blog.model.global.BaseResponse;
import com.preloode.blog.model.payment.PaymentAccount;
import com.preloode.blog.model.payment.PaymentAccountLogData;
import com.preloode.blog.model.payment.PaymentMethod;
import com.preloode.blog.model.payment.PaymentMethodLogData;
import com.preloode.blog.model.setting.Setting;
import com.preloode.blog.model.setting.SettingLogData;
import com.preloode.blog.model.setting.SettingSlider;
import com.preloode.blog.model.setting.SettingSliderLogData;
import com.preloode.blog.model.shop.*;
import com.preloode.blog.model.thirdParty.ThirdPartyAccount;
import com.preloode.blog.model.thirdParty.ThirdPartyAccountLogData;
import com.preloode.blog.model.thirdParty.ThirdPartyProvider;
import com.preloode.blog.model.thirdParty.ThirdPartyProviderLogData;
import com.preloode.blog.model.transaction.*;
import com.preloode.blog.model.user.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class GlobalRepository {


    private static final Logger logger = LoggerFactory.getLogger(GlobalRepository.class);

    @Autowired
    private MongodbConfiguration mongodb;


    public BaseResponse dropAllCollection() {

        BaseResponse result = new BaseResponse(
                "Failed to drop all collection",
                false
        );

        try {

            MongoOperations mongoOperation = mongodb.mongoTemplate();
            mongoOperation.dropCollection(CryptocurrencyAsset.class);
            mongoOperation.dropCollection(CryptocurrencyBinanceAveragePriceTicker.class);
            mongoOperation.dropCollection(CryptocurrencyBinanceExchangeInformation.class);
            mongoOperation.dropCollection(CryptocurrencyBitfinexSymbolDetail.class);
            mongoOperation.dropCollection(CryptocurrencyBittrexCurrency.class);
            mongoOperation.dropCollection(CryptocurrencyKrakenAssetPair.class);
            mongoOperation.dropCollection(CryptocurrencyTriangularArbitrage.class);
            mongoOperation.dropCollection(Company.class);
            mongoOperation.dropCollection(CompanyLogData.class);
            mongoOperation.dropCollection(CompanyBranch.class);
            mongoOperation.dropCollection(CompanyBranchLogData.class);
            mongoOperation.dropCollection(PaymentAccount.class);
            mongoOperation.dropCollection(PaymentAccountLogData.class);
            mongoOperation.dropCollection(PaymentMethod.class);
            mongoOperation.dropCollection(PaymentMethodLogData.class);
            mongoOperation.dropCollection(Setting.class);
            mongoOperation.dropCollection(SettingLogData.class);
            mongoOperation.dropCollection(SettingSlider.class);
            mongoOperation.dropCollection(SettingSliderLogData.class);
            mongoOperation.dropCollection(ShopBrand.class);
            mongoOperation.dropCollection(ShopBrandLogData.class);
            mongoOperation.dropCollection(ShopCategory.class);
            mongoOperation.dropCollection(ShopCategoryLogData.class);
            mongoOperation.dropCollection(ShopProduct.class);
            mongoOperation.dropCollection(ShopProductLogData.class);
            mongoOperation.dropCollection(ThirdPartyAccount.class);
            mongoOperation.dropCollection(ThirdPartyAccountLogData.class);
            mongoOperation.dropCollection(ThirdPartyProvider.class);
            mongoOperation.dropCollection(ThirdPartyProviderLogData.class);
            mongoOperation.dropCollection(TicketNumber.class);
            mongoOperation.dropCollection(TicketNumberLogData.class);
            mongoOperation.dropCollection(Transaction.class);
            mongoOperation.dropCollection(TransactionLogData.class);
            mongoOperation.dropCollection(TransactionCart.class);
            mongoOperation.dropCollection(TransactionCartLogData.class);
            mongoOperation.dropCollection(User.class);
            mongoOperation.dropCollection(UserGroup.class);
            mongoOperation.dropCollection(UserGroupLogData.class);
            mongoOperation.dropCollection(UserLog.class);
            mongoOperation.dropCollection(UserLogData.class);
            mongoOperation.dropCollection(UserRole.class);
            mongoOperation.dropCollection(UserRoleLogData.class);

            result.setResponse("All collection dropped");
            result.setResult(true);

            logger.info(result.getResponse());

        } catch(Exception exception) {

            logger.info(exception.getMessage());

        }

        return result;

    }


    public <T> List<T> findPagination(Query query, Class<T> model) {

        List<T> result = new ArrayList<>();

        try {

            MongoOperations mongoOperation = mongodb.mongoTemplate();
            result = mongoOperation.find(query, model);
            logger.info("Pagination retrieved");

        } catch(Exception exception) {

            logger.info(exception.getMessage());

        }

        return result;

    }


}
