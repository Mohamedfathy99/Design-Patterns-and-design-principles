package TheLiskovSubstitutionPrinciple;

public class Car extends Vehicle{


    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }

    boolean isHatchBack(){
        return true;
    }
}
