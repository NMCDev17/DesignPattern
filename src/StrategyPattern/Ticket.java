package StrategyPattern;

public class Ticket{
    private String name;
    private double price;
    private PromoteStrategy promote;
    public Ticket() {
    }

    public Ticket(PromoteStrategy promote)
    {
        this.promote = promote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PromoteStrategy getPromote() {
        return promote;
    }

    public void setPromote(PromoteStrategy promote) {
        this.promote = promote;
    }

    public double getPromotedPrice(double price) {
        return this.promote.doDiscount(price);
    }
}