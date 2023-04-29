package BuiderPattern;

import lombok.Builder;

public class Car {
    private String name;
    private String color;
    private String type;
    private String brand;
    private int price;

    public String getName() {
        return name;
    }

    public Car(){}
    public Car(String name, String color, String type, String brand, int price) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.brand = brand;
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.color + "-" + this.type + "-" + this.brand + "-" + this.price + "$";
    }
}
