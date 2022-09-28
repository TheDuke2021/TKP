package lab6;
public class Square extends Figure {
    private double a;
    public Square(double a) {
        this.a = a;
    }
    @Override
    public double getArea() {
        return a*a;
    }
}
