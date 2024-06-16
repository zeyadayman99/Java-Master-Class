package DiffExamples.ClassesAndObjects.InterfacesAndPolymorphism;

public class Car implements Vehicle{
    private int carSpeed;

    public Car(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    @Override
    public int getSpeed() {
        return carSpeed;
    }

    @Override
    public void setSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    @Override
    public void move(int amount) {
        setSpeed(getSpeed() + amount);
        System.out.println("start engine");
        System.out.println("accelerate...");
    }

    @Override
    public void applyBreaks(int amount) {
        System.out.println("apply break car is slowing down...");
        setSpeed(getSpeed() - amount);
    }
}
