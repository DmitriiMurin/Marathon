package Day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Boeing1", 2012, 36, 40000);
        Airplane airplane2 = new Airplane("Boeng2", 2014, 35, 45000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
