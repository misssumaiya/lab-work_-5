package ProblemE8_18;

import java.util.Random;

public class Die {
    public static Random generator;
    private int side;

    public Die(int side) {
        this.side = side;
        generator = new Random();
    }
    public int cast(){
        return 1+ generator.nextInt(side);
    }

}
