package StrategyPattern;

public class QuaterDiscountStrategy implements PromoteStrategy {

    @Override
    public double doDiscount(double price)
    {
        return price * 0.75D;
    }
}
