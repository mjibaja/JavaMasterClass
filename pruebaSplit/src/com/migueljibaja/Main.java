package com.migueljibaja;

public class Main {

    public static void main(String[] args) {
        String[] stringEjemplo = "Esto es una prueba".split(" ");
        for (String word : stringEjemplo) {
            System.out.println(word);
        }
    }
}
