package com.migueljibaja.com.migueljibaja._static;

public class StaticTest {
    //los campos y metodos declarados como "static" pertenecen a la clase y no a la instancia, por lo que su valor es el
    // mismo en todas las instancias
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances ++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
