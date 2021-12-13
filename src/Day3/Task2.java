package Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter dividend: ");
            double a = input.nextDouble();
            System.out.print("Enter divider: ");
            double b = input.nextDouble();
            if(b==0){
                System.out.println("You cannot divide by zero");
                break;
            }  System.out.println(a/b);
        }


        }

    }

