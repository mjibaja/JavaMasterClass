package com.migueljibaja;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am not very good on that, can I go for a swim instead");
    }
}
