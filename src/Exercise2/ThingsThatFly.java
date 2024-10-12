package Exercise2;

import java.util.ArrayList;

public class ThingsThatFly {
    public static void main(String[] args) {
        // Create one Airplane object and two Bird objects
        Airplane airplane = new Airplane("Boeing 747", 2016);
        Bird eagle = new Bird("Eagle");
        Bird hummingbird = new Bird("Hummingbird");

        // Store objects in an ArrayList
        ArrayList<Flight> flyingThings = new ArrayList<>();
        flyingThings.add(airplane);
        flyingThings.add(eagle);
        flyingThings.add(hummingbird);

        // Loop through the list and print details
        for (Flight thing : flyingThings) {
            System.out.print(thing);
            thing.fly();
            System.out.println(); // For a new line after each output
        }
    }
}
