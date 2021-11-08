package com.tr.task03.appliance.bean;

import java.util.Objects;

public class Appliance {
    private int id;
    private String category;
    private double price;

    public Appliance(){

    }

    public Appliance(int id, String category, double price) {
        this.id = id;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return id == appliance.id && Double.compare(appliance.price, price) == 0 && category.equals(appliance.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, price);
    }

    @Override
    public String toString() {
        return "category=" + category + ": " +
                "id=" + id +
                ", price=" + price;
    }
}
