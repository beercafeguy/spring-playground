package com.beercafeguy.spring.springbootstarter.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    private Integer id;
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
