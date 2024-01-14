package TheDependencyInjectionPrinciple;

public class Client {


    private Services myService;

    // injects via the constructor
    public Client(Services myService) {
        this.myService = myService;
    }

    public void setMyService(Services myService) {
        this.myService = myService;
    }
    public void doSomething(){
        myService.write("This is a message :)");
    }

}
