package com.preloode.blog.model.user;

import com.preloode.blog.enumeration.global.Country;
import com.preloode.blog.enumeration.global.Language;
import com.preloode.blog.enumeration.global.Gender;
import com.preloode.blog.enumeration.user.UserStatus;
import com.preloode.blog.enumeration.user.UserType;
import com.preloode.blog.model.company.CompanyListReference;
import com.preloode.blog.model.global.Base;
import com.preloode.blog.model.global.ContactReference;
import com.preloode.blog.model.global.CreditReference;
import com.preloode.blog.model.global.TimestampReference;
import org.springframework.data.mongodb.core.index.Indexed;


public class User extends Base {


    private UserAccountReference account;

    private String avatar;

    @Indexed
    private String city;

    private CompanyListReference company;

    private ContactReference contact;

    @Indexed
    private Country country;

    private CreditReference credit;

    @Indexed
    private Gender gender;

    private UserGroupReference group;

    @Indexed
    private Language language;

    private UserNameReference name;

    private UserPasswordReference password;

    private UserPaymentReference payment;

    private UserPrivilegeReference privilege;

    private String reference;

    private UserRoleReference role;

    @Indexed
    private String state;

    @Indexed
    private UserStatus status;

    private String streetAddress;

    @Indexed
    private UserType type;

    @Indexed(unique = true)
    private String username;

    @Indexed
    private String zipCode;


    public User() {


    }


    public User(String id, TimestampReference created, TimestampReference modified, UserAccountReference account, String avatar, String city, CompanyListReference company, ContactReference contact, Country country, CreditReference credit, Gender gender, UserGroupReference group, Language language, UserNameReference name, UserPasswordReference password, UserPaymentReference payment, UserPrivilegeReference privilege, String reference, UserRoleReference role, String state, UserStatus status, String streetAddress, UserType type, String username, String zipCode) {

        super(id, created, modified);
        this.account = account;
        this.avatar = avatar;
        this.city = city;
        this.company = company;
        this.contact = contact;
        this.country = country;
        this.credit = credit;
        this.gender = gender;
        this.group = group;
        this.language = language;
        this.name = name;
        this.password = password;
        this.payment = payment;
        this.privilege = privilege;
        this.reference = reference;
        this.role = role;
        this.state = state;
        this.status = status;
        this.streetAddress = streetAddress;
        this.type = type;
        this.username = username;
        this.zipCode = zipCode;

    }


    public UserAccountReference getAccount() {

        return account;

    }


    public void setAccount(UserAccountReference account) {

        this.account = account;

    }


    public String getAvatar() {

        return avatar;

    }


    public void setAvatar(String avatar) {

        this.avatar = avatar;

    }


    public String getCity() {

        return city;

    }


    public void setCity(String city) {

        this.city = city;

    }


    public CompanyListReference getCompany() {

        return company;

    }


    public void setCompany(CompanyListReference company) {

        this.company = company;

    }


    public ContactReference getContact() {

        return contact;

    }


    public void setContact(ContactReference contact) {

        this.contact = contact;

    }


    public Country getCountry() {

        return country;

    }


    public void setCountry(Country country) {

        this.country = country;

    }


    public CreditReference getCredit() {

        return credit;

    }


    public void setCredit(CreditReference credit) {

        this.credit = credit;

    }


    public Gender getGender() {

        return gender;

    }


    public void setGender(Gender gender) {

        this.gender = gender;

    }


    public UserGroupReference getGroup() {

        return group;

    }


    public void setGroup(UserGroupReference group) {

        this.group = group;

    }


    public Language getLanguage() {

        return language;

    }


    public void setLanguage(Language language) {

        this.language = language;

    }


    public UserNameReference getName() {

        return name;

    }


    public void setName(UserNameReference name) {

        this.name = name;

    }


    public UserPasswordReference getPassword() {

        return password;

    }


    public void setPassword(UserPasswordReference password) {

        this.password = password;

    }


    public UserPaymentReference getPayment() {

        return payment;

    }


    public void setPayment(UserPaymentReference payment) {

        this.payment = payment;

    }


    public UserPrivilegeReference getPrivilege() {

        return privilege;

    }


    public void setPrivilege(UserPrivilegeReference privilege) {

        this.privilege = privilege;

    }


    public String getReference() {

        return reference;

    }


    public void setReference(String reference) {

        this.reference = reference;

    }


    public UserRoleReference getRole() {

        return role;

    }


    public void setRole(UserRoleReference role) {

        this.role = role;

    }


    public String getState() {

        return state;

    }


    public void setState(String state) {

        this.state = state;

    }


    public UserStatus getStatus() {

        return status;

    }


    public void setStatus(UserStatus status) {

        this.status = status;

    }


    public String getStreetAddress() {

        return streetAddress;

    }


    public void setStreetAddress(String streetAddress) {

        this.streetAddress = streetAddress;

    }


    public UserType getType() {

        return type;

    }


    public void setType(UserType type) {

        this.type = type;

    }


    public String getUsername() {

        return username;

    }


    public void setUsername(String username) {

        this.username = username;

    }


    public String getZipCode() {

        return zipCode;

    }


    public void setZipCode(String zipCode) {

        this.zipCode = zipCode;

    }


}
