package com.preloode.blog.model.transaction;

import org.springframework.data.mongodb.core.index.Indexed;


public class TransactionUserThirdPartyProviderReference {


    @Indexed
    private String id;

    @Indexed
    private String name;


    public TransactionUserThirdPartyProviderReference() {


    }


    public TransactionUserThirdPartyProviderReference(String id, String name) {

        this.id = id;
        this.name = name;

    }


    public String getId() {

        return id;

    }


    public void setId(String id) {

        this.id = id;

    }


    public String getName() {

        return name;

    }


    public void setName(String name) {

        this.name = name;

    }


}
