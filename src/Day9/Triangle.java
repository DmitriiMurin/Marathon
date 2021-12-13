package Day9;

public class Triangle extends Figure{
    private int length1;
    private int length2;
    private int length3;

    public Triangle(String colour, int length1, int length2, int length3) {
        super(colour);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }


    @Override
    public double area() {
        double p = ((length1 + length2 + length3)/2);
        System.out.println("S of Triangle = " + (Math.sqrt(p*(p-length1)*(p-length2)*(p-length3))));
        return 0;
    }

    @Override
    public double perimeter() {
        System.out.println("P of Triangle = " + (length1 + length2 + length3));
        return 0;
    }



}
