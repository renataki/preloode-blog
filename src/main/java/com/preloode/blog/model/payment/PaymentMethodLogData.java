package com.preloode.blog.model.payment;

import com.preloode.blog.enumeration.global.Status;
import com.preloode.blog.enumeration.payment.PaymentType;
import com.preloode.blog.model.company.CompanyListReference;
import com.preloode.blog.model.global.Base;
import com.preloode.blog.model.global.TimestampReference;
import org.springframework.data.mongodb.core.index.Indexed;

import java.math.BigInteger;


public class PaymentMethodLogData extends Base {


    private PaymentMethodBusinessHourReference businessHour;

    private CompanyListReference company;

    private String description;

    private PaymentMethodFeeReference fee;

    private PaymentMethodDisplayReference footer;

    @Indexed
    private String name;

    private PaymentMethodDisplayReference payment;

    @Indexed
    private String paymentMethodId;

    @Indexed
    private BigInteger sequence;

    private PaymentMethodDisplayReference sidebar;

    @Indexed
    private Status status;

    @Indexed
    private PaymentType type;


    public PaymentMethodLogData() {


    }


    public PaymentMethodLogData(String id, TimestampReference created, TimestampReference modified, PaymentMethodBusinessHourReference businessHour, CompanyListReference company, String description, PaymentMethodFeeReference fee, PaymentMethodDisplayReference footer, String name, PaymentMethodDisplayReference payment, String paymentMethodId, BigInteger sequence, PaymentMethodDisplayReference sidebar, Status status, PaymentType type) {

        super(id, created, modified);
        this.businessHour = businessHour;
        this.company = company;
        this.description = description;
        this.fee = fee;
        this.footer = footer;
        this.name = name;
        this.payment = payment;
        this.paymentMethodId = paymentMethodId;
        this.sequence = sequence;
        this.sidebar = sidebar;
        this.status = status;
        this.type = type;

    }


    public PaymentMethodBusinessHourReference getBusinessHour() {

        return businessHour;

    }


    public void setBusinessHour(PaymentMethodBusinessHourReference businessHour) {

        this.businessHour = businessHour;

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


    public PaymentMethodFeeReference getFee() {

        return fee;

    }


    public void setFee(PaymentMethodFeeReference fee) {

        this.fee = fee;

    }


    public PaymentMethodDisplayReference getFooter() {

        return footer;

    }


    public void setFooter(PaymentMethodDisplayReference footer) {

        this.footer = footer;

    }


    public String getName() {

        return name;

    }


    public void setName(String name) {

        this.name = name;

    }


    public PaymentMethodDisplayReference getPayment() {

        return payment;

    }


    public void setPayment(PaymentMethodDisplayReference payment) {

        this.payment = payment;

    }


    public String getPaymentMethodId() {

        return paymentMethodId;

    }


    public void setPaymentMethodId(String paymentMethodId) {

        this.paymentMethodId = paymentMethodId;

    }


    public BigInteger getSequence() {

        return sequence;

    }


    public void setSequence(BigInteger sequence) {

        this.sequence = sequence;

    }


    public PaymentMethodDisplayReference getSidebar() {

        return sidebar;

    }


    public void setSidebar(PaymentMethodDisplayReference sidebar) {

        this.sidebar = sidebar;

    }


    public Status getStatus() {

        return status;

    }


    public void setStatus(Status status) {

        this.status = status;

    }


    public PaymentType getType() {

        return type;

    }


    public void setType(PaymentType type) {

        this.type = type;

    }


}
