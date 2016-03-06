package com.brunodevesa.criminalintent.model;

import java.util.UUID;

/**
 * Created by bruno.devesa on 06/03/2016.
 */
public class Crime {

    private UUID iD;
    private String title;

    public Crime() {
        // generate unique identifier:
        this.iD = UUID.randomUUID();
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
}
