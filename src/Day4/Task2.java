package Day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] array100 = new int[100];
        Random random= new Random();
        for (int i = 0 ; i< array100.length; i++) {
            array100[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array100));

        int max = 0;
        for (int element : array100) {
        if (element > max)
        max = element;
        }
        System.out.println("Max number in array: " + max);


        int min = 10000;
        for ( int element : array100) {
            if (element < min)
                min = element;
        }
        System.out.println("Min number in array: " + min);

        int a0 = 0;
        for (int element : array100) {
            if (element %10 == 0)
                a0++;
        }
        System.out.println(a0);

        int sum = 0;
        for (int element : array100) {
            if (element %10 == 0)
                sum += element;
        }
        System.out.println(sum);
    }
}
