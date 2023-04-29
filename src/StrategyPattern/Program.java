package StrategyPattern;

public class Program {
    //khi co 1 doan code thay doi qua nhieu lan;
    //Khi ta phai implement lai qua nhieu lan behavior cua 1 doi tuong theo nhieu cach khac nhau;
    //Khi ta can thay doi 1 behavior cua 1 doi tuong luc runtime;
    public static void main(String[] args) {
        for(int i = 1; i <= 3; ++i)
        {
            int radom = (int) (Math.random() * 3) + 1;
            switch (radom) {
                case 1 -> {
                    Ticket ticket = new Ticket();
                    ticket.setName("ticket " + i);
                    ticket.setPrice(50D);
                    ticket.setPromote(new NoDiscountStrategy());
                    System.out.println(ticket.getName() + ": " + ticket.getPromotedPrice(ticket.getPrice()));
                    break;
                }
                case 2 -> {
                    Ticket ticket = new Ticket();
                    ticket.setName("ticket " + i);
                    ticket.setPrice(50);
                    ticket.setPromote(new HaftDiscountStrategy());
                    System.out.println(ticket.getName() + ": " + ticket.getPromotedPrice(ticket.getPrice()));
                    break;
                }
                case 3 -> {
                    Ticket ticket = new Ticket();
                    ticket.setName("ticket " + i);
                    ticket.setPrice(50);
                    ticket.setPromote(new QuaterDiscountStrategy());
                    System.out.println(ticket.getName() + ": " + ticket.getPromotedPrice(ticket.getPrice()));
                    break;
                }
                default -> throw new IllegalStateException("Unexpected value: " + radom);
            }
        }
    }
}
