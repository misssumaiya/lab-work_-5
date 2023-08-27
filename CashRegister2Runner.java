package ProblemE8_2;

public class CashRegister2Runner {
    public static void main(String[] args) {

        final Coin2 DOLLAR = new Coin2(1.00,"DOLLAR");
        final Coin2 QUARTER = new Coin2(0.25,"QUARTER");
        final Coin2 DIME = new Coin2(0.10,"DIME");
        final Coin2 NICKEL = new Coin2(0.05,"NICKEL");
        final Coin2 PENNY = new Coin2(0.01,"PENNY");

        CashRegister2 register = new CashRegister2();

        register.recordPurchase(2.19);
        register.recordPurchase(4.50);
        register.recordPurchase(10.24);

        register.recordPayment(40,DOLLAR);

        double payment= register.getTotalPayment();
        double purchase = register.getTotalPurchase();
        double change = register.getTotalChange();
        System.out.printf("payment :  %.3f\n  purchase : % .3f\n  change  :% .3f\n ",payment,purchase,change);

        System.out.printf("number of dollar:  %.0f\n" ,register.giveChange(DOLLAR));
        System.out.printf("number of quarter: %.0f\n" ,register.giveChange(QUARTER));
        System.out.printf("number of dime:  %.0f\n" ,register.giveChange(DIME));
        System.out.printf("number of nickel: %.0f\n" ,register.giveChange(NICKEL));
        System.out.printf("number of penny: %.0f\n" ,register.giveChange(PENNY));




    }
}
