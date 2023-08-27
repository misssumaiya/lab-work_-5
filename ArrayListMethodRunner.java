package ProblemE8_25;

public class ArrayListMethodRunner {
    public static void main(String[] args) {
        ArrayListMethod account = new ArrayListMethod(10000);

        System.out.println("statement: "+account.getStatement());

        account.deposit(500);
        account.withdraw(1000);
        account.withdraw(600);
        account.deposit(1000);
        account.withdraw(10000);

        System.out.println("statement: " +account.getStatement());
        System.out.println("balance : " +account.getBalance());
    }
}
