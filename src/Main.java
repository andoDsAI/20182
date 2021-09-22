public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Account account1 = new NormalAccount(1, 0);
        Account account2 = new VIPAccount(2, 0);
        Account account3 = new SavingAccount(3, 0);
        account1.deposit(100000);
        account2.deposit(1000000);
        account3.deposit(500000);

        account2.withdraw(500000);
        account3.withdraw(300000);

    }
}
