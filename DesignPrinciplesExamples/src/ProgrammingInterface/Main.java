package ProgrammingInterface;

public class Main {
    public static void main(String[] args) {
        DisplayModule monitor = new Monitor();
        DisplayModule projector = new Projector();

        monitor.display();
        projector.display();

    }
}