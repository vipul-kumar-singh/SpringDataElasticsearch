package com.vkstech.elasticsearchdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "bank", shards = 2)
public class Bank {

    @Id
    private Long id;

    private String name;

    private String city;

    private String state;

    public Bank() {
    }

    public Bank(Long id, String name, String city, String state) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
