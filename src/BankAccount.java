public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int NUM_OF_ACCOUNTS;
    private static int TOTAL_DEPOSITS;

    BankAccount(){
        NUM_OF_ACCOUNTS++;
    }

    public void deposit(double amount, String acctType){
        if(acctType == "checking"){
            this.checkingBalance += amount;
        } else {
            this.savingsBalance += amount;
        }
        TOTAL_DEPOSITS += amount;
    }

    public void withdraw(double amount, String acctType){
        if(acctType == "checking" && checkingBalance > amount){
            checkingBalance -= amount;
        }   else if(savingsBalance >= amount){
            savingsBalance -= amount;
        }
        TOTAL_DEPOSITS -= amount;
    }


    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void checkBalances(){
        System.out.println(checkingBalance + savingsBalance);
    }
}
