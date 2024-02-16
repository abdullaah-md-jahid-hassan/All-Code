package com.mycompany.l9_07_1007_atm.measean;
import java.util.Scanner;
import java.util.Date;
class Account {
    private
            int id;
            double balance;
            static double annualInterestRate;
            private Date dateCreated;
public
        Account() {
            id = 0;
            balance = 0;
            annualInterestRate = 0;
            dateCreated = new Date();
        }
        Account(int newId, double newBalance) {
            id = newId;
            balance = newBalance;
            dateCreated = new Date();
        }
        void setId(int newId) {id = newId;}
        void setBalance(double newBalance) {balance = newBalance;}
        void setAnnualInterestRate(double newAnnualInterestRate) {annualInterestRate = newAnnualInterestRate;}
        int getId() {return id;}
        double getBalance() {return balance;}
        double getAnnualInterestRate() {return annualInterestRate;}
        String getDateCreated() {return dateCreated.toString();}
        double getMonthlyInterestRate() {return annualInterestRate / 12;}
        double getMonthlyInterest() {return balance * (getMonthlyInterestRate() / 100);}
        void withdraw(double amount) {balance -= amount;}
        void deposit(double amount) {balance += amount;}
}
public class L9_07_1007_atmMeasean {
    public static void initialBalance(Account[] a) {
        int initialBalance = 100;
        for (int i = 0; i < a.length; i++) a[i] = new Account(i, initialBalance);
    }
    public static boolean isTransaction(int choice) {return choice > 0 && choice < 4;}
    public static boolean isValidID(int id, Account[] a) {
        for (int i = 0; i < a.length; i++) if (id == a[i].getId()) return true;
        return false;
    }
    public static int displayMainMenu(Scanner input) {
        System.out.print("\nMain menu\n1: check balance\n2: withdraw" +"\n3: deposit\n4: exit\nEnter a choice: ");
        return input.nextInt();
    }
    public static void executeTransaction(int c, Account[] a, int id, Scanner input) {
        switch (c) {
            case 1: 
                System.out.println("The balance is " + a[id].getBalance());
                break;
            case 2:
                System.out.print("Enter an amount to withdraw: "); 
                a[id].withdraw(input.nextDouble());
                break;
            case 3: 
                System.out.print("Enter an amount to deposit: "); 
                a[id].deposit(input.nextDouble());
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];
        initialBalance(accounts);
        do {
            System.out.print("Enter an id: ");
            int id = input.nextInt();
            if (isValidID(id, accounts)) {
                int choice;
                do {
                    choice = displayMainMenu(input);
                    if (isTransaction(choice)) executeTransaction(choice, accounts, id, input);
                } while (choice != 4);
            }
        } while (true); 
    }
}
