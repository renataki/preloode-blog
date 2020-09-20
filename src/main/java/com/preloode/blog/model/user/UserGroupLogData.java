package com.preloode.blog.model.user;

import com.preloode.blog.enumeration.global.Status;
import com.preloode.blog.model.company.CompanyListReference;
import com.preloode.blog.model.global.Base;
import com.preloode.blog.model.global.TimestampReference;
import org.springframework.data.mongodb.core.index.Indexed;

import java.math.BigInteger;


public class UserGroupLogData extends Base {


    private CompanyListReference company;

    private UserGroupTransactionRangeReference deposit;

    private String description;

    @Indexed
    private String name;

    @Indexed
    private BigInteger sequence;

    @Indexed
    private Status status;

    private UserGroupTransactionRangeReference transaction;

    @Indexed
    private String userGroupId;

    private UserGroupTransactionRangeReference withdrawal;


    public UserGroupLogData() {


    }


    public UserGroupLogData(String id, TimestampReference created, TimestampReference modified, CompanyListReference company, UserGroupTransactionRangeReference deposit, String description, String name, BigInteger sequence, Status status, UserGroupTransactionRangeReference transaction, String userGroupId, UserGroupTransactionRangeReference withdrawal) {

        super(id, created, modified);
        this.company = company;
        this.deposit = deposit;
        this.description = description;
        this.name = name;
        this.sequence = sequence;
        this.status = status;
        this.transaction = transaction;
        this.userGroupId = userGroupId;
        this.withdrawal = withdrawal;

    }


    public CompanyListReference getCompany() {

        return company;

    }


    public void setCompany(CompanyListReference company) {

        this.company = company;

    }


    public UserGroupTransactionRangeReference getDeposit() {

        return deposit;

    }


    public void setDeposit(UserGroupTransactionRangeReference deposit) {

        this.deposit = deposit;

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


    public UserGroupTransactionRangeReference getTransaction() {

        return transaction;

    }


    public void setTransaction(UserGroupTransactionRangeReference transaction) {

        this.transaction = transaction;

    }


    public String getUserGroupId() {

        return userGroupId;

    }


    public void setUserGroupId(String userGroupId) {

        this.userGroupId = userGroupId;

    }


    public UserGroupTransactionRangeReference getWithdrawal() {

        return withdrawal;

    }


    public void setWithdrawal(UserGroupTransactionRangeReference withdrawal) {

        this.withdrawal = withdrawal;

    }


}
