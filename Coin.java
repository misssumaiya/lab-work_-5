package ProblemE8_1;

public class Coin {

    private double coinValue;
    private String coinName;

    public Coin(double value,String name) {
        coinValue=value;
        coinName=name;
    }

    public double getCoinValue() {
        return coinValue;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinValue(double coinValue) {
        this.coinValue = coinValue;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }
}


