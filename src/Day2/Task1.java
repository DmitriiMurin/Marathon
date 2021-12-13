package Day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int x = input.nextInt();
        if (x>0 && x<=4){
            System.out.println("Low-rise house");
        } else if (x>=5 && x<=8) {
            System.out.println("Mid-rise house");
        } else if (x>=9) {
            System.out.println("Multi-storey building");
        } else if(x<=0){
            System.out.println("Input Error");
        }
    }
}
