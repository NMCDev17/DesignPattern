package BuiderPattern;

public class Program {
    public static void main(String[] args) {
        Car car = new CarBuilder().addName("Ferrari")
                                  .addColor("red")
                                  .addType("four wheel")
                                  .addPrice(100000)
                                  .builder();
        System.out.println(car.toString());
    }
}
