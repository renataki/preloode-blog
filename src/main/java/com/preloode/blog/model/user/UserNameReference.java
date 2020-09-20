package com.preloode.blog.model.user;

import org.springframework.data.mongodb.core.index.Indexed;


public class UserNameReference {


    @Indexed
    private String first;

    @Indexed
    private String last;

    @Indexed
    private String middle;


    public UserNameReference() {


    }


    public UserNameReference(String first, String last, String middle) {

        this.first = first;
        this.last = last;
        this.middle = middle;

    }


    public String getFirst() {

        return first;

    }


    public void setFirst(String first) {

        this.first = first;

    }


    public String getLast() {

        return last;

    }


    public void setLast(String last) {

        this.last = last;

    }


    public String getMiddle() {

        return middle;

    }


    public void setMiddle(String middle) {

        this.middle = middle;

    }


}
