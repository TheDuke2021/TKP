package lab6;

public class Cube extends Figure{


    @Override
    public double getArea() {
        return 6*a*a;
    }

    public double getVolume() {
        return a*a*a;
    }
}
