package Day6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car("Audi","Black",2011);
        Motorbike motobike = new Motorbike("Honda","green",2021);
        car1.info();
        motobike.info();
        System.out.println(car1.yearDifference(2021));
        System.out.println(motobike.yearDifference(2021));



    }
}
