package com.javapractice;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParameter {
    private BankAccount account;
    private double ammount;
    private boolean branch;
    private double excpected;

    public BankAccountTestParameter(double ammount, boolean branch, double excpected) {
        this.ammount = ammount;
        this.branch = branch;
        this.excpected = excpected;
    }

    @org.junit.Before
    public void setup() {
        account = new BankAccount("Tim", "Bulova", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test ...");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {
                {100.00,true,1100.00},
                {200.00,true,1200.00},
                {325.14,true,1325.14},
                {489.33,true,1489.33},
                {1000.00,true,2000.00}
        });
    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(ammount,branch);
        assertEquals(excpected,account.getBalance(),.01);
    }


}
