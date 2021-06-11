package lab14;

import java.util.ArrayList;
import java.io.*;


public class Account implements operations, Serializable {
    public String name;
    public int balance;
    public int account_number;

    Account(String name, int balance, int account_number) {
        this.name = name;
        this.balance = balance;
        this.account_number = account_number;

    }


    @Override
    public int withdraw(Account account_number, int amount) {
        System.out.println("_______________________________________________________");
        System.out.println("WITHDRAW TO THE BANK");
        System.out.println("_______________________________________________________");
        if (amount <= balance) {
            balance = balance - amount;

            System.out.println(amount + " rs is withdrawn from the account.\n Now the total balance is " + balance);

        } else {
            System.out.println("the entered amount is not enough");

        }
        return balance;
    }

    @Override
    public int deposite(Account account_number, int amount) {
        System.out.println("_______________________________________________________");
        System.out.println("DEPOSITE TO THE BANK");
        System.out.println("_______________________________________________________");
        balance = balance + amount;
        System.out.println(amount + " rs has been deposited to the  account. \n Now the total balance is  " + balance);

        return balance;
    }

    @Override
    public int transfer(Account account_number, int amount) {
        System.out.println("_______________________________________________________");
        System.out.println("TRANSFER TO BANK");
        System.out.println("_______________________________________________________");
        balance = balance + amount;
        System.out.println(amount + " rs has been transfered to the  account. \n Now the total balance is  " + balance);

        return balance;

    }

    @Override
    public int balance_inquiry(Account account_number) {
        System.out.println("_______________________________________________________");
        System.out.println("BALANCE INQUIRY");
        System.out.println("_______________________________________________________");
        System.out.println("The total balance in  account is  " + balance);

        return balance;

    }

}