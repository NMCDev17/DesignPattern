package DecoratorPattern;

public class Fruit extends DecoratorMilkTea{
    public Fruit(IMilkTea milkTea) {
        super(milkTea);
        System.out.print("fruit");
    }

    public double cost() {
        System.out.print("cost fruit");
        return super.cost() + 3D;
    }
}
