package Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter=1;
        while (counter<=4){
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            if (b==0){
                System.out.println("Division by zero");
                continue;
            }
            System.out.println(a/b);
            counter++;
        }
    }
}
