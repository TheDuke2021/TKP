package lab6;
public class Circle extends Figure {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.1415*radius*radius;
    }
}
