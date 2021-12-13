package Day5;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCarModel("AUDI A6");
        System.out.println(car1.getCarModel());
        car1.setCarColour("Black");
        System.out.println(car1.getCarColour());
        car1.setYear(2011);
        System.out.println(car1.getYear());

    }


    static class Car{
    private String carModel;
    private String carColour;
    private int year;

    public void setCarModel(String model){
        this.carModel= model;
    }

    public String getCarModel(){
        return carModel;
    }

    public void setCarColour(String colour){
        this.carColour = colour;
    }
    public String getCarColour(){
        return carColour;
    }

    public void setYear (int year){
        if (year <= 0){
            System.out.println("Error");}
     else {
        this.year = year;}
    }
    public int getYear(){
        return  year;
    }

        }
    }




