package academy.learnprogramming;


import java.math.BigDecimal;

public class Account{

    private double accountNumber;
    private double accountBalance;
    private boolean signedIn;



    public Account(double accountBalance, boolean signedIn){
        this.accountNumber = Math.random() * 10000000;
        this.accountBalance = accountBalance;
        this.signedIn = signedIn;
    }

    public double getAccountNumber() {
        if(!this.signedIn){
            System.out.println("You do not have access to this account");
        }
        return accountNumber;
    }

    public double getAccountBalance() {
        if(!this.signedIn){
            System.out.println("You do not have access to this account");
        }
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    public void deposit(double money){
        this.accountBalance += money;
        System.out.println("Your account balance after depositing: " +money + " is: "+this.accountBalance);
    }

    public void withdraw(double money){
        if(money<accountBalance){
            accountBalance -= money;
            System.out.println("Your account balance after withdrawal: -" +money + " is: "+this.accountBalance);
        } else {
            System.out.println("insufficient funds. Your current balance is: " + accountBalance);
        }
    }


}
