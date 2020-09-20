package com.preloode.blog.model.shop;

public class ShopProductPriceReference {


    private ShopProductPriceOneTimeReference oneTime;

    private ShopProductPriceRecurringReference recurring;


    public ShopProductPriceReference() {


    }


    public ShopProductPriceReference(ShopProductPriceOneTimeReference oneTime, ShopProductPriceRecurringReference recurring) {

        this.oneTime = oneTime;
        this.recurring = recurring;

    }


    public ShopProductPriceOneTimeReference getOneTime() {

        return oneTime;

    }


    public void setOneTime(ShopProductPriceOneTimeReference oneTime) {

        this.oneTime = oneTime;

    }


    public ShopProductPriceRecurringReference getRecurring() {

        return recurring;

    }


    public void setRecurring(ShopProductPriceRecurringReference recurring) {

        this.recurring = recurring;

    }


}
