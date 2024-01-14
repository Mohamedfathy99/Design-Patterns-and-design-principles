package OpenClosedPrincipleExample;

public class Rectangle implements Shape{
    @Override
    public double calculateArea() {
        return length * width;
    }
    public double length = 5;
    public double width = 20;


}
