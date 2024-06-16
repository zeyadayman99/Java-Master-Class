package DiffExamples.ClassesAndObjects.InterfacesAndPolymorphism;

public class ElectricScooter implements Vehicle
{
    private int scooterSpeed;

    public ElectricScooter(int scooterSpeed) {
        this.scooterSpeed = scooterSpeed;
    }

    @Override
    public int getSpeed() {
        return scooterSpeed;
    }

    @Override
    public void setSpeed(int carSpeed) {
        this.scooterSpeed = scooterSpeed;
    }

    @Override
    public void move(int amount) {
        System.out.println("start engine");
        System.out.println("start accelerating...");
        setSpeed(getSpeed() + amount);
    }

    @Override
    public void applyBreaks(int amount) {
        System.out.println("slowing down...");
        setSpeed(getSpeed() - amount);
    }
}
