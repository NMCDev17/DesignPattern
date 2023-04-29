package BuiderPattern;

public class CarBuilder implements ICarBuilder {
    Car car = new Car();
    public String name;
    private String color;
    private String type;
    private String brand;
    private int price;

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
    public CarBuilder addName(String name)
    {
        this.name = name;
        return this;
    }

    public CarBuilder addColor(String color)
    {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder addType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public CarBuilder addBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder addPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public Car builder() {
        return new Car(name,color,type,brand,price);
    }
}
