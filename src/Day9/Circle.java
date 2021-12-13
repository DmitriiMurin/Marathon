package Day9;

public class Circle extends Figure{

    private int radiusCircle;

    public Circle(String colour, int radiusCircle) {
        super(colour);
        this.radiusCircle = radiusCircle;
    }

    @Override
    public double area() {
        System.out.println("S of Circle = " + (Math.PI*(radiusCircle*radiusCircle)));
        return 0;
    }

    @Override
    public double perimeter() {
        System.out.println("P of Circle = " + (2*Math.PI*radiusCircle));
        return 0;
    }


}
