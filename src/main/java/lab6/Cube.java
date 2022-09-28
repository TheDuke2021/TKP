package lab6;
public class Cube extends Figure{
    private double a;
    public Cube(double a) {
        this.a = a;
    }
    @Override
    public double getArea() {
        return 6*a*a;
    }
    public double getVolume() {
        return a*a*a;
    }
}
