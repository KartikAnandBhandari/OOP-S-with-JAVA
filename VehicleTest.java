class Vehicle {
    String brand, model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(brand + " " + model + " - Price: " + price);
    }
}

class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;

    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }
}

class ElectricCar extends Car {
    int batteryCapacity;
    double chargingTime;

    public ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }
}

class Motorcycle extends Vehicle {
    int engineCapacity;
    String type;

    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 30000, 5, "Petrol");
        Vehicle electricCar = new ElectricCar("Tesla", "Model 3", 50000, 5, "Electric", 100, 1.5);
        Vehicle bike = new Motorcycle("Yamaha", "R1", 20000, 1000, "Sport");

        car.displayDetails();
        electricCar.displayDetails();
        bike.displayDetails();
    }
}