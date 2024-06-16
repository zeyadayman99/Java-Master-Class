package DiffExamples.ClassesAndObjects.InterfacesAndPolymorphism;

public class Bicycle implements Vehicle
{
    private int bikeSpeed;

    public Bicycle(int bikeSpeed) {
        this.bikeSpeed = bikeSpeed;
    }

    @Override
    public int getSpeed() {
        return bikeSpeed;
    }

    @Override
    public void setSpeed(int bikeSpeed) {
        this.bikeSpeed = bikeSpeed;
    }

    @Override
    public void move(int amount) {
        System.out.println("start peddling");
        System.out.println("accelerate...");
        setSpeed(getSpeed() + amount);
    }

    @Override
    public void applyBreaks(int amount) {
        System.out.println("apply breaks");
        setSpeed(getSpeed() - amount);
    }
}
