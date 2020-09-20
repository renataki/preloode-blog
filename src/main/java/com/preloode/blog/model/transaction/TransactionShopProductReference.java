package com.preloode.blog.model.transaction;

import com.preloode.blog.enumeration.shop.PriceRecurring;

import java.util.List;


public class TransactionShopProductReference {


    private List<PriceRecurring> cycleList;

    private List<String> idList;

    private List<String> nameList;

    private TransactionShopProductVariantReference variantList;


    public TransactionShopProductReference() {


    }


    public TransactionShopProductReference(List<PriceRecurring> cycleList, List<String> idList, List<String> nameList, TransactionShopProductVariantReference variantList) {

        this.cycleList = cycleList;
        this.idList = idList;
        this.nameList = nameList;
        this.variantList = variantList;

    }


    public List<PriceRecurring> getCycleList() {

        return cycleList;

    }


    public void setCycleList(List<PriceRecurring> cycleList) {

        this.cycleList = cycleList;

    }


    public List<String> getIdList() {

        return idList;

    }


    public void setIdList(List<String> idList) {

        this.idList = idList;

    }


    public List<String> getNameList() {

        return nameList;

    }


    public void setNameList(List<String> nameList) {

        this.nameList = nameList;

    }


    public TransactionShopProductVariantReference getVariantList() {

        return variantList;

    }


    public void setVariantList(TransactionShopProductVariantReference variantList) {

        this.variantList = variantList;

    }


}
