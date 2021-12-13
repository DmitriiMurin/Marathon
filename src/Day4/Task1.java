package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int arrayLength = input.nextInt();
        Random random = new Random();

        int[] array = new int[arrayLength];
        for (int i = 0; i< array.length; i++)
            array[i]= random.nextInt(100);

        System.out.println(Arrays.toString(array));
        System.out.println("Size of array is: " + arrayLength);

        int counter8 = 0;
        for(int i=0; i<array.length; i++) {
            if (array[i] > 8)
                counter8++;
        }
        System.out.println("The number of digits is more than eight: " + counter8);

        int counter1 = 0;
        for (int i=0; i<arrayLength; i++) {
            if (array[i] == 1)
            counter1++;
        }
        System.out.println("The number of digits equal to one: " + counter1);

        int counter2 = 0;
        for (int i=0; i<arrayLength; i++){
            if (array[i]%2 == 0)
                counter2++;
        }
        System.out.println("The number of even digits: " + counter2);

        int counter3 = 0;
        for (int i = 0; i<arrayLength; i++){
            if(array[i]%2 != 0)
                counter3++;
        }
        System.out.println("The number of odd digits: " + counter3);

        int sum = 0;
        for (int i = 0; i<arrayLength; i++){
            sum += array[i];
        }
        System.out.println("The sum of all the numbers in the array is: " + sum);
    }
}
