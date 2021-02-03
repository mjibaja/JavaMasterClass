package com.javapractice;

import static org.junit.Assert.*;


public class UtilitiesTest {

    private  Utilities utilities;

    @org.junit.Before
    public void setup() {
        utilities = new Utilities();
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void everyNthChar() {
        char[] output = utilities.everyNthChar(new char[] {'h','e','l','l','o'},2);
        assertArrayEquals(new char[] {'e','l'}, output);
    }

    @org.junit.Test
    public void everyNthChar_Errorn() {
        char[] output = utilities.everyNthChar(new char[] {'h','e','l','l','o'},8);
        assertArrayEquals(new char[] {'h','e','l','l','o'}, output);
    }

    @org.junit.Test
    public void removePairs_sc1() {
        String cadena = utilities.removePairs("AABCDDEFF");
        assertEquals("ABCDEF",cadena);
    }

    @org.junit.Test
    public void removePairs_sc2() {
        String cadena = utilities.removePairs("ABCCABDEEF");
        assertEquals("ABCABDEF",cadena);
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300,utilities.converter(10,5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_divideByZero() throws Exception {
        assertEquals(300,utilities.converter(10,0));
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull(utilities.nullIfOddLength("odd"));
        assertNotNull(utilities.nullIfOddLength("even"));
    }
}