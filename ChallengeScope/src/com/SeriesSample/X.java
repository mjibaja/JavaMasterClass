package com.SeriesSample;

public class X {
    //este tipo de uso de variables con el mismo nombre solo es para motivos educativos, no es una buena practica de programación
    private int x;

    public X(int x) {
        this.x = x;
    }

    public void x() {
        for (int x = 0; x < 13; x++) {
            System.out.println(x + " times " +  this.x + " equals " + x * this.x);
        }
    }
}
