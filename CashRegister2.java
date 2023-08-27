package ProblemE8_2;

public class CashRegister2 {
    private double payment;
    private double purchase;

    public CashRegister2() {
        payment = 0;
        purchase = 0;
    }
    public void recordPurchase(double amount){
        purchase=payment+amount;
    }
    public void recordPayment(int coinCount,Coin2 coinType){
        payment=payment+coinCount*coinType.getCoinValue();
    }
    public double getTotalPurchase(){
        return purchase;
    }
    public double getTotalPayment(){
        return payment;
    }
    public double getTotalChange(){
        return payment-purchase;
    }
    public double giveChange(Coin2 coinType){
        double change=payment-purchase;
           double coinValue = coinType.getCoinValue();
             int coinNumber;
             coinNumber=(int) (change/coinValue);
             payment=payment-(coinValue*coinNumber);

             if(coinType.getCoinValue()==0.01){
                 coinNumber++;
             }

             return coinNumber;
    }

}
