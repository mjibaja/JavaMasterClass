package com.migueljibaja.mylibrary;

public class Series {

    public int nSum(int n) {
        int suma = 0;
        for (int i = 0; i <= n ; i++) {
            suma += i;

        }
        return suma;
    }

    public int factorial(int n) {
        if (n == 0) {
            return 0;
        }
        int facto = 1;
        for (int i = 1; i <= n ; i++) {
            facto = facto * i;
        }
        return facto;
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }


}
