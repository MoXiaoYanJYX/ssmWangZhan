package com.wangzhan.domain;

import java.io.Serializable;
import java.util.Date;


public class News implements Serializable {
    private String id;
    private String name;
    private String cid;
    private int count;
    private Date date;
    private String details;

    public News() {
    }

    public News(String id, String name, String cid, int count, Date date, String details) {
        this.id = id;
        this.name = name;
        this.cid = cid;
        this.count = count;
        this.date = date;
        this.details = details;
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

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
