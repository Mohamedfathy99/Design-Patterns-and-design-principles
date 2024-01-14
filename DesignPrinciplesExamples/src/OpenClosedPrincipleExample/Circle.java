package OpenClosedPrincipleExample;

public class Circle implements Shape{
    public double radius = 10;

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }


}
