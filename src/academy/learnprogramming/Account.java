package academy.learnprogramming;



public class Account{

    private int accountNumber;
    private String accountHolder;
    private double accountBalance;
    private boolean isSignedIn = false;


    public Account(int accountNumber, String accountHolder, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean GetIsSignedIn() {
        return isSignedIn;
    }

    public void setSignedIn(boolean signedIn) {
        isSignedIn = signedIn;
    }

    public void deposit(double money){
        this.accountBalance += money;
        System.out.println("Your account balance after depositing: " +money + " is: "+this.accountBalance);
    }

    public void withdraw(double money){
        if(money<accountBalance){
            accountBalance -= money;
            System.out.println(this.accountBalance);
        }
    }


}
