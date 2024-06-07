public class Car {
    private String manufacturer;
    private double price;
    private EngineType engineType;

    public Car(String manufacturer, double price, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString(){
        return "car details: " + getManufacturer() +
                ", " + getPrice() + ", " + getEngineType();
    }

}
