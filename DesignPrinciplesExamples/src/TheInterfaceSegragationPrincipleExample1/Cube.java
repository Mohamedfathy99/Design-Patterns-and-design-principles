package TheInterfaceSegragationPrincipleExample1;

public class Cube implements Shape, SolidShape, ManageShape{
    @Override
    public double area() {
        // Calculate the surface of area for cuboid
        return 1.0;
    }

    @Override
    public double volume() {
        // Calculate the volume of cuboid
        return 1.0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}
