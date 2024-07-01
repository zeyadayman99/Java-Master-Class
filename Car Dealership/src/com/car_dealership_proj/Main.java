import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car bmw_m8 = new Car("BMW", 1000000, EngineType.petrol);
        Car mercides_cla = new Car("mercides", 190000, EngineType.petrol);
        Car bmw_ix8 = new Car("BMW", 1600000, EngineType.electric);
        Car lexus_lxc = new Car("Lexus", 900000, EngineType.diesel);
        Car corrola = new Car("Toyota", 50000, EngineType.diesel);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(bmw_ix8);
        cars.add(bmw_m8);
        cars.add(mercides_cla);
        cars.add(lexus_lxc);
        cars.add(corrola);

        //static members (fields and methods) can only be accessed using the class name
        //as they belong to the class itself not the instances from it
        CarDealerShip.getNumOfDealerships();
        CarDealerShip newHorizon = new CarDealerShip("New Horizon dealership", cars);
        CarDealerShip.getNumOfDealerships();
        int num_of_cars = newHorizon.numberOfCars();
        System.out.println("number of dealership cars = " + num_of_cars);
        System.out.println("Enter Manufacturer name you want to search for: ");
        Scanner scanner = new Scanner(System.in);
        String manufacturer = scanner.next();
        Car carYouSearchedFor = newHorizon.findCarByManufacturer(manufacturer);
        System.out.println(carYouSearchedFor);
        System.out.println("To enter new Car into the dealership press 1: ");
        int num = scanner.nextInt();
        switch (num){
            case 1: {
                System.out.println("Enter Manufacturer: ");
                String newManufacturer = scanner.next();
                System.out.println("Enter price: ");
                double price = scanner.nextDouble();
                System.out.println("if the Engine Type is petrol press 1, " +
                        "if diesel press 2, if electric press 3");
                int n = scanner.nextInt();
                EngineType engineType;
                switch (n){
                    case 1: engineType = EngineType.petrol; break;
                    case 2: engineType = EngineType.diesel; break;
                    case 3: engineType = EngineType.electric; break;
                    default: engineType = engineType = EngineType.petrol; break;
                }
                Car newCar = new Car(newManufacturer, price, engineType);
                cars.add(newCar);
                newHorizon.numberOfCars();
                System.out.println("your car is entered to the dealership and it's details is: ");
                System.out.println(newCar);
            }
            break;
            default:
                break;
        }
        System.out.println("number of dealership cars = " + newHorizon.numberOfCars());
        return;
    }
}