package StrategyPattern;

public class HaftDiscountStrategy implements PromoteStrategy{
    @Override
    public double doDiscount(double price)
    {
        return price * 0.5;
    }
}
