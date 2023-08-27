package ProblemE8_1;

public class CashRegisterRunner {
    public static void main(String[] args) {


    final Coin DOLLAR = new Coin(1.00,"DOLLAR");
    final Coin QUARTER = new Coin(0.25,"QUARTER");
    final Coin DIME = new Coin(0.10,"DIME");
    final Coin NICKE  = new Coin(0.05,"NICKEL");
    final Coin PENNIES = new Coin(0.01,"PENNIES");

        CashRegister register = new CashRegister();

        register.recordPurchase(2.19);
        register.recordPurchase(1.95);
        register.recordPurchase(10.95);
        register.recordPurchase(8.70);

        register.receivePayment(20,DOLLAR);
        register.receivePayment(8,QUARTER);
        register.receivePayment(15,DIME);
        register.receivePayment(10,NICKE);
        register.receivePayment(40,PENNIES);

        double changeAmount= register.getChange();

        System.out.printf("change : %.2f\n",changeAmount);
        System.out.println("expected change : 0.61");
    }
}