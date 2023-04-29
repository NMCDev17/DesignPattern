package DecoratorPattern;

public class MilkTea implements IMilkTea{
    public MilkTea() {
        System.out.println("milk tea");
    }
    @Override
    public double cost() {
        return 5D;
    }
}
