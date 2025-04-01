// Base class for all devices
abstract class Device {
    private String name;
    private boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println(getName() + " is ON.");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println(getName() + " is OFF.");
    }

    public boolean isOn() {
        return isOn;
    }

    public String getName() {  // Getter for private field name
        return name;
    }

    public abstract void checkStatus();
}

// Interface for controllable devices
interface Controllable {
    void control(String command);
}

// Interface for alertable devices
interface Alertable {
    void sendAlert(String message);
}

// Light class
class Light extends Device implements Controllable {
    public Light(String name) {
        super(name);
    }

    @Override
    public void control(String command) {
        if (command.equalsIgnoreCase("ON")) {
            turnOn();
        } else if (command.equalsIgnoreCase("OFF")) {
            turnOff();
        } else {
            throw new InvalidCommandException("Invalid command: " + command);
        }
    }

    @Override
    public void checkStatus() {
        System.out.println(getName() + " status: " + (isOn() ? "ON" : "OFF"));
    }
}

// Thermostat class
class Thermostat extends Device implements Controllable {
    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 20; // Default temperature
    }

    @Override
    public void control(String command) {
        try {
            int temp = Integer.parseInt(command);
            this.temperature = temp;
            System.out.println(getName() + " set to " + temp + "°C.");
        } catch (NumberFormatException e) {
            throw new InvalidCommandException("Invalid temperature: " + command);
        }
    }

    @Override
    public void checkStatus() {
        System.out.println(getName() + " is " + (isOn() ? "ON" : "OFF") + ", Temperature: " + temperature + "°C");
    }
}

// SecurityCamera class
class SecurityCamera extends Device implements Alertable {
    public SecurityCamera(String name) {
        super(name);
    }

    @Override
    public void sendAlert(String message) {
        System.out.println("ALERT from " + getName() + ": " + message);
    }

    @Override
    public void checkStatus() {
        System.out.println(getName() + " status: " + (isOn() ? "ON" : "OFF"));
    }
}

// Custom Exceptions
class InvalidCommandException extends RuntimeException {
    public InvalidCommandException(String message) {
        super(message);
    }
}

class DeviceNotFoundException extends RuntimeException {
    public DeviceNotFoundException(String message) {
        super(message);
    }
}

// Main class to demonstrate functionality
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create devices
        Light livingRoomLight = new Light("Living Room Light");
        Thermostat livingRoomThermostat = new Thermostat("Living Room Thermostat");
        SecurityCamera frontDoorCamera = new SecurityCamera("Front Door Camera");

        // Control devices
        try {
            System.out.println("--- Controlling Devices ---");
            livingRoomLight.control("ON");
            livingRoomThermostat.control("22");
            frontDoorCamera.turnOn();
            frontDoorCamera.sendAlert("Motion detected at front door!");

            System.out.println("\n--- Checking Device Status ---");
            livingRoomLight.checkStatus();
            livingRoomThermostat.checkStatus();
            frontDoorCamera.checkStatus();

            // Simulate an invalid command
            System.out.println("\n--- Testing Invalid Command ---");
            livingRoomLight.control("ONN"); // This will throw an exception
        } catch (InvalidCommandException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (DeviceNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}