package DecoratorPattern;

public abstract class DecoratorMilkTea implements IMilkTea{
    private IMilkTea milkTea;

    protected DecoratorMilkTea(IMilkTea inner){
        this.milkTea = inner;
    }
    @Override
    public double cost()
    {
        System.out.println(" cost of milk tea");
        return milkTea.cost();
    }
}
