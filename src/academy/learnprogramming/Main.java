package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//      this is the helper class I made so I could display the correct decimal values
        RoundingNumbers rounding = new RoundingNumbers();

//      User rick = new User("Rick", "password");

//      Account ricksAccount = new Account(100.00, rick.isLoggedIn());

//      This is the method Call for getting rounded numbers
//      System.out.println("account balance: " + rounding.getRoundedNumber(ricksAccount.getAccountBalance()));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you a new Customer? Y/N");

           String userInput = scanner.next();

            if(userInput.toLowerCase().equals("y")){
                System.out.println("Welcome! Please Create a new user sign in.");

                    System.out.println("Please enter a user name");
                    System.out.println("Must be at least 6 characters");
                    String userName = scanner.next();
//              TODO: 7/28/2021 figure out how to set conditions for user input

                    System.out.println("Please enter a password");
                    System.out.println("Must be at least 6 characters");
                    String password = scanner.next();
//              TODO: 7/28/2021 figure out how to set conditions for user input

// This is where we're calling the user class with the user input provided
                    User newUser = new User(userName, password);

// This is where we're getting our user input for their account info.
                System.out.println("What is your starting balance?");
                double startingBalance = scanner.nextDouble();
// This is where we're calling our Account Class with the user input and user.isLoggedIn() boolean to make sure they're logged in
                Account newAccount = new Account(startingBalance, newUser.isLoggedIn());

                System.out.println("You are signed in! What would you like to do?");
                System.out.println("Deposit: D");
                System.out.println("Withdraw: W");
                System.out.println("Check Balance: C");
                System.out.println("New Account: N");


            } else if(userInput.toLowerCase().equals("n")){
                System.out.println("Welcome back! Please Sign in");
                System.out.println("Please enter your user name");
                String userName = scanner.next();
                System.out.println("Please enter your password");
                String password = scanner.next();
                // TODO: 7/28/2021 this is where we'll need our user validation
                // TODO: 7/28/2021 as well as our call to the database to retrieve user and account data.
            }

        scanner.close();



        }


    }
