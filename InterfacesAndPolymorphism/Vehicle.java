package DiffExamples.ClassesAndObjects.InterfacesAndPolymorphism;

public interface Vehicle {
    //can only contain :

    //Constants
    //this can't be private and it is by default public and static
    double purchasePrice = 250;

    //abstract methods
    //methods in interfaces are by default abstract and public
    int getSpeed();
    void setSpeed(int carSpeed);
    void move(int amount);
    void applyBreaks(int amount);

    //default methods
    default void vehicleState(){
        System.out.println("vehicle state is moving...");
    }
}
