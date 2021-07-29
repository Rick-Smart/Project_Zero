package academy.learnprogramming;


public class Main {

    public static void main(String[] args) {

        RoundingNumbers rounding = new RoundingNumbers();

        User rick = new User("Rick", "password");

        System.out.println(rick.isLoggedIn());

        Account ricksAccount = new Account(100.00, rick.isLoggedIn());

        System.out.println("account balance: " + rounding.getNumber(ricksAccount.getAccountBalance()));


    }
}
