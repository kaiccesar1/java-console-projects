package entities;

import entities.Account;

public class User {
    private String name;
    private String doc;
    private Account account;

    public User(String name, String doc){
        this.name = name;
        this.doc = doc;

        account = new Account();
        account.generateNumberAccount();
    }

    public String getName(){
        return name;
    }

    public String getDoc(){
        return doc;
    }

    public int account(){
        return account.getAccountNumber();
    }

    public double balance(){
        return account.getBalance();
    }

    public boolean deposit(double value){
        boolean response = account.deposit(value);
        return response;
    }

    public boolean withdraw(double value){
        boolean response = account.withdraw(value);
        return response;
    }
}
