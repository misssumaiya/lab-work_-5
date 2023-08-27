package ProblemE8_16;

import java.util.Scanner;

public class InputRunner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Input.readInt(in,"enter an integer:","that is out of bound",1,100);
    }
}
