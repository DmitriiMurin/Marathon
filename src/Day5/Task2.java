package Day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike("Honda","black", 2020);
        System.out.println(bike.getBikeModel());
        System.out.println(bike.getBikeColour());
        System.out.println(bike.getBikeYear());
    }
}

    class Motorbike{
        private String bikeModel;
        private String bikeColour;
        private int bikeYear;

    public Motorbike(){
        this.bikeModel = "anyMotorbike";
        this.bikeColour = "anyColour";
        this.bikeYear = 1900;
        System.out.println("Hi from first constructor");
    }


        public Motorbike(String bikeModel){
        System.out.println("Hi from second constructor");
        this.bikeModel = bikeModel;
    }
    public Motorbike(String bikeModel, String bikeColour, int bikeYear){
        System.out.println("Hi from third constructor");
        this.bikeModel = bikeModel;
        this.bikeColour = bikeColour;
        this.bikeYear = bikeYear;
    }
        public String getBikeModel() {
            return bikeModel;
        }

        public String getBikeColour() {
            return bikeColour;
        }

        public int getBikeYear() {
            return bikeYear;
        }
    }
