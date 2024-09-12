class Car {
    // Static variable (class variable)
    static int numberOfCars;

    // Instance variables
    String model;
    int year;

    // parameterized Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        numberOfCars++; // Incrementing the static variable
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
    }

    // Static method to display the number of cars
    public static void displayCarCount() {
        System.out.println("Total number of cars: " + numberOfCars);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 2020);
        Car car2 = new Car("BMW", 2021);

        // Accessing instance method
        car1.displayDetails();
        car2.displayDetails();

        // Accessing static method using class name
        Car.displayCarCount();
    }
}
