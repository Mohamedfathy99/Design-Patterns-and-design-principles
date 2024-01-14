package TheInterfaceSegragationPrincipleExample1;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Cube();
        System.out.println(shape.area());
        ManageShape manageShape = new Cube();
        System.out.println(manageShape.calculate());


    }
}
