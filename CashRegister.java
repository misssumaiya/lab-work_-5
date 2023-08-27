package ProblemE8_1;

public class CashRegister {

    private double purchase;
    private double payment;

    public CashRegister() {
        purchase = 0;
        payment=0;
    }
    public void recordPurchase(double amount){
        purchase=purchase+amount;
    }
   public void receivePayment(double coinCount,Coin cointType){
        payment=purchase+coinCount*cointType.getCoinValue();
   }
   public double getTotalPayment(){
        return payment;
   }
   public double getTotalPurchase(){
        return purchase;
   }
   public double getTotalChange(){
        return (payment-purchase);
   }
   public double getChange(){
        double change=payment-purchase;
        payment=0;
        purchase=0;
        return change;
   }



}
