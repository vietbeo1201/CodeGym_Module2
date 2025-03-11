package B5_access_modifier.StaticProperty;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("mazda 4", "Skyactiv 4");
        System.out.println(Car.numberOfCars);
    }
}
