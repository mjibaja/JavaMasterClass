package com.migueljibaja;

public class Main {

    public static void main(String[] args) {
        Account miguelAccount = new Account("Miguel");
        miguelAccount.deposit(1000);
        miguelAccount.withdraw(500);
        miguelAccount.withdraw(-200);
        miguelAccount.deposit(-20);
        miguelAccount.calculateBalance();

        System.out.println("Balance on account is " +  miguelAccount.getBalance());

    }
}
