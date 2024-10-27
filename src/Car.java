import java.time.Year;

public class Car {
    public String brand;
    public String model;
    public int year;
    public String color;


    // Constructor
    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color= color;
    }

    // Method to get car age
    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - this.year;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return this.brand + " " + this.model + " (" + this.year + ")";
    }

    // Main method for testing
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2010,"Black");
        System.out.println(myCar);  // Output: Toyota Corolla (2010)
        System.out.println("Car Age: " + myCar.getAge() + " years");  // Output: Car Age: 14 years (as of 2024)
    }
}