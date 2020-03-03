package Objects.practice;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    int [] myIntegers = sortArray(getIntegers(5));
	    for (int i=0;i<myIntegers.length;i++){
            System.out.println("Elemento #" + i + " tiene el valor: " + myIntegers[i]);
        }
        System.out.println("El promedio es: " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Ingresa " + number + " números enteros.\r" );
        int[] values = new int[number];

        for (int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }

        return values;

    }

     public static double getAverage(int[] array){
        int sum = 0;
        for (int i=0;i<array.length;i++) {
            sum+= array[i];
        }
        return (double)sum/(double)array.length;
     }

     public static int[] sortArray(int[] array){
        int[] orderArray = new int[array.length];
        for (int i=0;i<array.length;i++){
            orderArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0;i<orderArray.length-1;i++){
                if(orderArray[i] < orderArray[i+1]) {
                    temp = orderArray[i];
                    orderArray[i] = orderArray[i+1];
                    orderArray[i+1] = temp;
                    flag = true;
                }
            }
         }
        return orderArray;
     }
}
