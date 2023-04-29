package BuiderPattern;

//Builder Pattern chi nen ep dung vao trong truong hop khoi tao 1 doi tuong co many Parameters;
//Object co qua nhieu data phuc tap;
//De tao 1 Builder Pattern ta can co tat ca cac property cua doi tuong can tao
//va 1 property luu doi tuong do de tra ve;
//Method builde se return ve doi tuong can tao dua tren cac gia tri truyen vao;
public interface ICarBuilder {
    public CarBuilder addName(String name);
    public CarBuilder addColor(String color);
    public CarBuilder addType(String type);
    public CarBuilder addBrand(String brand);
    public CarBuilder addPrice(int price);
    public Car builder();
}
