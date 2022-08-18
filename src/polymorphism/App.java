package polymorphism;
import java.util.Scanner;
// Polymorphism- the ability of an object to identify as more than one type.
// An object takes many shapes/forms
// Dynamic Polymorphism - an object takes many forms at runtime execution of a program after compilation.
public class App {

    //Static Polymorphism
    public static void staticPolymorphism() {
        Vehicle car, boat, bike;
        car = new Car();
        boat = new Boat();
        bike = new Bike();

        Vehicle[] racers = {car, bike, boat};

        for(Vehicle x: racers) {
            x.go();
        }
    }

    //Dynamic Polymorphism
    public static void dynamicPolymorphism() {
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle;

        System.out.println("Which vehicle do you want to use for racing?");
        System.out.print("1=Car 2=Boat 3=Bike:  ");
        int choice = scanner.nextInt();

        if(choice == 1) {
            vehicle = new Car();
            vehicle.go();
        }
        else if(choice == 2) {
            vehicle = new Boat();
            vehicle.go();
        }
        else if(choice == 3) {
            vehicle = new Bike();
            vehicle.go();
        }
        else {
            System.out.println("Invalid option");
        }
    }
    public static void main(String[] args) {
        //staticPolymorphism();
        dynamicPolymorphism();
    }
}
