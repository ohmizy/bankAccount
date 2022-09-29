public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount bs = new BankAccount();
        bs.deposit( 1000, "checking");
        bs.checkBalances();
        bs.withdraw(500, "checking");
        bs.checkBalances();
        bs.withdraw(1000, "checking");
        bs.checkBalances();
    }
}
