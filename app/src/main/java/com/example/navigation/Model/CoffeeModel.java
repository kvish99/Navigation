package com.example.navigation.Model;

public class CoffeeModel {

    String name,price;
    int imageview;

    public CoffeeModel(String name, String price, int imageview) {
        this.name = name;
        this.price = price;
        this.imageview = imageview;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageview() {
        return imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }
}
