import ProblemE8_1.CashRegister;
import ProblemE8_1.Coin;

public class CashRegisterTester {
    public static void main(String[] args) {
        final Coin DOLLAR = new Coin(1.00,"DOLLAR");
        final Coin QUARTER = new Coin(0.25,"QUARTER");
        final Coin DIME = new Coin(0.10,"DIME");
        final Coin NICKE  = new Coin(0.05,"NICKEL");
        final Coin PENNIES = new Coin(0.01,"PENNIES");

        CashRegister register = new CashRegister();

        register.recordPurchase(2.19);
        register.recordPurchase(1.95);
        register.recordPurchase(3.99);
        register.recordPurchase(15.85);
        register.recordPurchase(14.29);

        register.receivePayment(30,DOLLAR);
        register.receivePayment(16,QUARTER);
        register.receivePayment(20,DIME);
        register.receivePayment(40,NICKE);
        register.receivePayment(400,PENNIES);

        double changeAmount= register.getChange();

        System.out.printf("change : %.2f\n",changeAmount);
        System.out.println("expected change : 3.73");
    }
}

