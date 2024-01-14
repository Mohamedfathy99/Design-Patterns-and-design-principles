package TheInterfaceSegragationPrincipleExample1;

public class Square implements Shape, ManageShape{
    @Override
    public double calculate() {
        return this.area();
    }

    @Override
    public double area() {
        return 2.0;
    }
}
