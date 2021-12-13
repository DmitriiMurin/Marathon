package Day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter name of the town: ");
            String nameTown = input.nextLine();
            if(nameTown.equals("Stop")){
                    break;
            }
            switch (nameTown){
            case "Moscow":
            case "Vladivostok":
            case "Rostov":
                System.out.println("The city you entered is in Russia");
                    break;
            case "Rome":
            case "Milan":
            case "Turin":
                    System.out.println("The city you entered is in Italy");
                    break;
            case "Liverpool":
            case "Manchester":
            case "London":
                    System.out.println("The city you entered is in England");
                    break;
            case "Berlin":
            case "Munich":
            case "Koln":
                    System.out.println("The city you entered is in Germany");
                    break;
                    default:
                    System.out.println("Unknown country");
            }
        }
    }
}
