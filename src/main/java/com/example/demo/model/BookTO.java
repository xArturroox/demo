package com.example.demo.model;

public class BookTO {
    private long id;
    private String name;

    public BookTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
