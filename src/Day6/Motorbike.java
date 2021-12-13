package Day6;

public class Motorbike {
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

    public Motorbike(String model, String colour, int year) {
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    void info() {
        System.out.println("This motorbike is " + model);
    }

    public int yearDifference(int inputYear) {
        return inputYear - year;
    }
}