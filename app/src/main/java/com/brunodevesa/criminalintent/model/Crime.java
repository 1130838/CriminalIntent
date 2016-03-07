package com.brunodevesa.criminalintent.model;

import java.util.Date;
import java.util.UUID;

/**
 * Created by bruno.devesa on 06/03/2016.
 */
public class Crime {

    private UUID iD;
    private String title;
    private Date mDate;
    private  boolean isSolved;



    public Crime() {
        // generate unique identifier:
        this.iD = UUID.randomUUID();
        mDate = new Date();
    }


    public UUID getiD() {
        return iD;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setIsSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }
}
