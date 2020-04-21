package com.liuyang.spring_boot.springbootmybatis.model;

/**
 * Password POJO
 */
public class Password {

    private String url;
    private String name;
    private String password;
    private String note;


    public Password(String url, String name, String password, String note) {
        this.url = url;
        this.name = name;
        this.password = password;
        this.note = note;
    }

    public Password() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
