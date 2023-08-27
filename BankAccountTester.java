package ProblemE8_5;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(5000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account1.withdraw(2000);
        System.out.println("account1 number is: "+account1.getAccountNumber());
        System.out.println("account1 balance is: " +account1.getBalance());

        account2.deposit(1000);
        account2.withdraw(4000);
        System.out.println("accoun2 number is: " +account2.getAccountNumber());
        System.out.println("accoun2 balance is: " +account2.getBalance());
    }
}
