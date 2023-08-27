package ProblemE8_17;

public class Numeric {
   public static double intPower(double x,int n){
       if(n>0 && n%2 == 0){
           double xn = Math.pow(Math.pow(x,n/2.0),2);
           return  xn;
       }
       else if (n>0 && n%2!=0) {
           double xn = Math.pow(x,n-1);
           return xn;
       }
       else {
           return 1.0/Math.pow(x,-n);
       }
   }
}
