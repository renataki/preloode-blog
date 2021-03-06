package com.preloode.blog.model.thirdParty;

import com.preloode.blog.enumeration.global.Status;
import com.preloode.blog.model.company.CompanyListReference;
import com.preloode.blog.model.global.Base;
import com.preloode.blog.model.global.TimestampReference;
import org.springframework.data.mongodb.core.index.Indexed;

import java.math.BigInteger;


public class ThirdPartyProvider extends Base {


    private CompanyListReference company;

    private String description;

    @Indexed(unique = true)
    private String name;

    @Indexed
    private BigInteger sequence;

    @Indexed
    private Status status;


    public ThirdPartyProvider() {


    }


    public ThirdPartyProvider(String id, TimestampReference created, TimestampReference modified, CompanyListReference company, String description, String name, BigInteger sequence, Status status) {

        super(id, created, modified);
        this.company = company;
        this.description = description;
        this.name = name;
        this.sequence = sequence;
        this.status = status;

    }


    public CompanyListReference getCompany() {

        return company;

    }


    public void setCompany(CompanyListReference company) {

        this.company = company;

    }


    public String getDescription() {

        return description;

    }


    public void setDescription(String description) {

        this.description = description;

    }


    public String getName() {

        return name;

    }


    public void setName(String name) {

        this.name = name;

    }


    public BigInteger getSequence() {

        return sequence;

    }


    public void setSequence(BigInteger sequence) {

        this.sequence = sequence;

    }


    public Status getStatus() {

        return status;

    }


    public void setStatus(Status status) {

        this.status = status;

    }


}
