package Objects.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray =  new int[]{1,2,3,4,5,6,7,8};

        reverse(myArray);

        System.out.println(Arrays.toString(myArray));
    }

    public static void reverse(int[] array){
        int[] reveArray = new int[array.length];
        for (int i=0;i < array.length;i++) {
            reveArray[i] = array[array.length-1- i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reveArray[i];
        }
    }
}
