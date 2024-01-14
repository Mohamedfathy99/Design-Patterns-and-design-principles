package TheDependencyInjectionPrinciple;

public class ServicesA implements Services{
    @Override
    public void write(String message) {
        System.out.println("Hello World");
    }
}
