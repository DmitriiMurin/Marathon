package Day6;

public class Car {
    String model;
    String colour;
    int year;



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String model, String colour, int year) {
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public void info() {
        System.out.println("This car is " + model);
    }
    public int yearDifference(int inputYear){
        return Math.abs(inputYear - year);
    }
}

