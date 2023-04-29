package DecoratorPattern;

public class WhiteBubble extends DecoratorMilkTea{
    public WhiteBubble(IMilkTea milkTea)
    {
        super(milkTea);
        System.out.println("white bubble");
    }

    public double cost()
    {
        System.out.print("cost of WhiteBubble");
        return super.cost() + 1.5D;
    }
}
