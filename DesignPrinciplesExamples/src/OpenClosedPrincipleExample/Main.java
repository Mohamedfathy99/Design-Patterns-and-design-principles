package OpenClosedPrincipleExample;

public class Main {
    public static void main(String[] args) {


        Shape circle = new Circle();
        System.out.println("The area of circle = " + circle.calculateArea());
        System.out.println();
        Shape rectangle = new Rectangle();
        System.out.println("The area of rectangle = " + rectangle.calculateArea());


    }
}
