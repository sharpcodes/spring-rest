package com.scs.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by skrishna on 7/28/16.
 */
@XmlRootElement(name = "Job")
public class Job {

    private String name;
    private int id;
    private int poNumber;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getPoNumber() {
        return poNumber;
    }


    public void setPoNumber(int poNumber) {
        this.poNumber = poNumber;
    }
}
