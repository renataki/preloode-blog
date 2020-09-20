package com.preloode.blog.configuration.api.kraken;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;


@Configuration
public class ApiKrakenFeeWithdrawalConfiguration {


    @Value("${api.kraken.fee.withdrawal.btc}")
    private BigDecimal btc;

    @Value("${api.kraken.fee.withdrawal.eth}")
    private BigDecimal eth;

    @Value("${api.kraken.fee.withdrawal.eur}")
    private BigDecimal eur;


    public BigDecimal getBtc() {

        return btc;

    }


    public void setBtc(BigDecimal btc) {

        this.btc = btc;

    }


    public BigDecimal getEth() {

        return eth;

    }


    public void setEth(BigDecimal eth) {

        this.eth = eth;

    }


    public BigDecimal getEur() {

        return eur;

    }


    public void setEur(BigDecimal eur) {

        this.eur = eur;

    }


}
