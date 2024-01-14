package TheDependencyInjectionPrinciple;

public class Main {
    public static void main(String[] args) {
        Services services = new ServicesA(); // This is an actual injectors
        Client client = new Client(services); // This injects via a constructor
        client.doSomething();
        client.setMyService(services);

    }
}
