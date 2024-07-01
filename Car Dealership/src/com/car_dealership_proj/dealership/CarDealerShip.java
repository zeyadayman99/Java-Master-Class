import java.util.ArrayList;

public class CarDealerShip {
    private String name;
    private ArrayList<Car> cars;
    public static int num_dealerships = 0;

    public CarDealerShip(String name) {
        this.name = name;
        setCars(null);
        num_dealerships++;
    }

    public CarDealerShip(String name, ArrayList<Car> cars) {
        this.name = name;
        this.cars = cars;
        num_dealerships++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public int numberOfCars() {
        return getCars().size();
    }
    public void addNewCar(Car car){
        cars.add(car);
    }
    public Car findCarByManufacturer(String manufacturer){
        for (Car car : cars){
            if(car.getManufacturer().equals(manufacturer))
                return car;
        }
        return new Car("N/A", 0.0, null);
    }
    public static void getNumOfDealerships(){
        System.out.println(num_dealerships);
    }
}
