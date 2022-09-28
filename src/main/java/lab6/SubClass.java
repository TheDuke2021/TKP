package lab6;
//Зеленый куб со стороной 3
public class SubClass extends SuperClass implements ThreeD, Colored {
    @Override
    public String getColor() {
        return "green";
    }
    @Override
    public double getVolume() {
        return 3*3*3;
    }
    @Override
    public double getArea() {
        return 6*3*3;
    }
}
