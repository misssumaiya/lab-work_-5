package ProblemE8_16;

import java.util.Scanner;

public class Input {
    public static int readInt(Scanner in,String promt,String error,int min,int max){

        boolean outOfBound = false;
        int number;
        do {
            System.out.println(promt);
            number = in.nextInt();
            if(number>=min && number<=max){
                outOfBound = false;
            }
            else {
                System.out.println(error);
                outOfBound = true;
            }
        }while (outOfBound==true);

        return number;
    }
}
