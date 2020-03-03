package Objects.practice;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    int [] myIntegers = getIntegers(5);
	    for (int i=0;i<myIntegers.length;i++){
            System.out.println("Elemento #" + i + " tiene el valor: " + myIntegers[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Ingresa " + number + " números enteros.\r" );
        int[] values = new int[number];

        for (int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }

        return values;

    }
}
