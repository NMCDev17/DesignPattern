package DecoratorPattern;

public class BlackSuger extends DecoratorMilkTea{
    public BlackSuger(IMilkTea milkTea)
    {
        super(milkTea);
        System.out.println("blacksuger");
    }

    public double cost()
    {
        System.out.print("cost of black suger");
        return super.cost() + 2D;
    }
}
