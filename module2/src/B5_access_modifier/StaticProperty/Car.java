package B5_access_modifier.StaticProperty;

public class Car {
    private String brand;
    private String engine;
    public static int numberOfCars;
    public Car(String brand, String engine) {
        this.brand = brand;
        this.engine = engine;
        numberOfCars++;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }

}
