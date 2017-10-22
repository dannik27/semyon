package com.semyon.semyonapplication.entity;



public class Product {

    private int id;
    private String name;
    private String description;
    private int count;


    public Product(int id, String name, String description, int count) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.count = count;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
