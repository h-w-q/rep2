package com.example.domain;

public class Account {
    private Integer id;
    private String name;
    private String bankBelong;

    public Account() {
    }

    public Account(String name, String bankBelong) {
        this.name = name;
        this.bankBelong = bankBelong;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBankBelong() {
        return bankBelong;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBankBelong(String bankBelong) {
        this.bankBelong = bankBelong;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bankBelong='" + bankBelong + '\'' +
                '}';
    }
}
