package ProblemE8_18;

public class DieSimulator {
    public static void main(String[] args) {
        Die d = new Die(6);
        Die e = new Die(10);
        int TRIES = 10;
        System.out.println("Die 1:");
        for (int i=1;i<=TRIES;i++){
            int n = d.cast();
            System.out.print(n+" ");
        }
        System.out.println();

        System.out.println("Die 2:");
        for (int i=1;i<=TRIES;i++){
            int n = e.cast();
            System.out.print(n+" ");
        }

    }
}
