package Objects.practice;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] myIntegers = readIntegers(5);
        for (int i=0;i<myIntegers.length;i++){
            System.out.println("Elemento #" + i + " tiene el valor: " + myIntegers[i]);
        }
        System.out.println("El mínimo es: " + findMin(myIntegers));
    }

    public static int[] readIntegers(int count) {
        System.out.println("Ingresa " + count + " números enteros.\r" );
        int[] values = new int[count];

        for (int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }

        return values;

    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int i=1;i<array.length;i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
