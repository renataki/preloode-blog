package com.preloode.blog.model.cryptocurrency;

import com.preloode.blog.enumeration.cryptocurrency.Exchanger;
import com.preloode.blog.enumeration.cryptocurrency.ExchangerStatus;


public class CryptocurrencyExchanger {


    private CryptocurrencyExchangerFeeReference fee;

    private Exchanger name;

    private ExchangerStatus status;


    public CryptocurrencyExchanger() {


    }


    public CryptocurrencyExchanger(CryptocurrencyExchangerFeeReference fee, Exchanger name, ExchangerStatus status) {

        this.fee = fee;
        this.name = name;
        this.status = status;

    }


    public CryptocurrencyExchangerFeeReference getFee() {

        return fee;

    }


    public void setFee(CryptocurrencyExchangerFeeReference fee) {

        this.fee = fee;

    }


    public Exchanger getName() {

        return name;

    }


    public void setName(Exchanger name) {

        this.name = name;

    }


    public ExchangerStatus getStatus() {

        return status;

    }


    public void setStatus(ExchangerStatus status) {

        this.status = status;

    }


}
