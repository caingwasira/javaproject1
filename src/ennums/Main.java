package ennums;

// Enums - grouping of objects that behave similarly to objects.
// - ordered listing of items in a collection

enum Planet {
    MERCURY(1), 
    MARS(2), 
    PLUTO(3), 
    EARTH(4), 
    JUPITER(5), 
    SATURN(6), 
    URANUS(7), 
    VENUS(8), 
    NEPTUNE(9);

    int number;
    Planet(int num) {
        this.number = num;
    }
}

public class Main {
    public static void main(String[] args) {
        Planet planet = Planet.MARS;

        habitable(planet);
    }

    static void habitable(Planet planet) {
        switch(planet) {
            case EARTH: System.out.println("You can live here:");
                        System.out.println("This is planet #"+planet.number);
            break;
            default: System.out.println("You cannot live here...yet");
                     System.out.println("This is planet #"+planet.number);
            break;
        }
    }
}
