package Day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boeing", 2015, 30, 50000);
        airplane.setYear(2012);
        airplane.setLength(32);
        airplane.fillUp(250);
        airplane.fillUp(375);
        airplane.info();
    }
}
