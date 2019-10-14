package com.wangzhan.domain;

import java.io.Serializable;

public class Website implements Serializable {
    private String id;
    private String name;
    private String keywords;
    private String details;
    private String telephone;
    private String emali;
    private String icp;
    private String copyright;

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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmali() {
        return emali;
    }

    public void setEmali(String emali) {
        this.emali = emali;
    }

    public String getIcp() {
        return icp;
    }

    public void setIcp(String icp) {
        this.icp = icp;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    @Override
    public String toString() {
        return "Website{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", keywords='" + keywords + '\'' +
                ", details='" + details + '\'' +
                ", telephone='" + telephone + '\'' +
                ", emali='" + emali + '\'' +
                ", icp='" + icp + '\'' +
                ", copyright='" + copyright + '\'' +
                '}';
    }
}
