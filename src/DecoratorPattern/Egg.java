package DecoratorPattern;

public class Egg extends DecoratorMilkTea{
    public Egg(IMilkTea milkTea) {
        super(milkTea);
        System.out.println("egg");
    }

    @Override
    public double cost() {
        System.out.print("cost of Egg");
        return super.cost() + 3D;
    }
}
