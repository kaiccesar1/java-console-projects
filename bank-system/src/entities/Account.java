package entities;

import java.util.Random;

public class Account {
    Random random = new Random();

    private int accountNumber;
    private double balance;
    private boolean status;

    public void generateNumberAccount(){
        this.accountNumber = random.nextInt(1, 10000000);
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit(double value){
        if(value <= 0.0){
            return false;
        }

        balance += value;
        return true;
    }

    public boolean withdraw(double value){
        if(value <= 0.0){
            return false;
        }
        balance -= value;
        return true;
    }
}
