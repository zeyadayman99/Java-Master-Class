package DiffExamples.ClassesAndObjects.InterfacesAndPolymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(120);
        Bicycle bicycle = new Bicycle(40);
        ElectricScooter scooter = new ElectricScooter(80);
        Vehicle[] vehicles = {car, bicycle, scooter};
        Person person = new Person("zeyad ayman", vehicles);
        for (Vehicle vehicle : vehicles) {
            System.out.println("current speed = " + vehicle.getSpeed());
            vehicle.move(20);
            System.out.println("new speed = " + vehicle.getSpeed());
            vehicle.applyBreaks(10);
            System.out.println("new speed = " + vehicle.getSpeed());
            vehicle.vehicleState();
            System.out.println("--------------------------------------------");
        }
        System.out.println(Vehicle.purchasePrice);

    }
}
