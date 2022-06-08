package com.bridgelabz.object;


import java.util.Scanner;

public class Account {
    double balance;
    double updatedAmount;

    public Account(double balance) {
        this.balance = balance;
    }

    public void debit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount for debit through account: ");
        int debit = sc.nextInt();

        if (debit < balance) {
            updatedAmount = balance - debit;
            System.out.println("Debit amount is: " + debit);
            System.out.println("Updated account balance after debit amount: " + updatedAmount);
        } else {
            System.out.println("Sorry.....Debit amount exceeded account balance.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account balance: ");

        Account account = new Account(sc.nextDouble());
        account.debit();
    }
}