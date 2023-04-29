package DecoratorPattern;

public class Bubble extends DecoratorMilkTea{
    public Bubble(IMilkTea milkTea)
    {
        super(milkTea);
        System.out.println("buble");
    }

    @Override
    public double cost()
    {
        System.out.print("cost of Bubble");
        return super.cost() + 1D;
    }
}
