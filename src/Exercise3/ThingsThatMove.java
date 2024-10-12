package Exercise3;

import java.util.ArrayList;

public class ThingsThatMove {
    public static void main(String[] args) {
        ArrayList<Movement> movingObjects = new ArrayList<>();

        // Create objects
        Airplane airplane = new Airplane("Boeing 747", 2016);
        Bird eagle = new Bird("Eagle");
        Bird hummingbird = new Bird("Hummingbird");

        // Store them in the list
        movingObjects.add(airplane);
        movingObjects.add(eagle);
        movingObjects.add(hummingbird);

        // Print the objects and their movements
        for (Movement movingObject : movingObjects) {
            System.out.println(movingObject);
            movingObject.fly();
            movingObject.walk();
            movingObject.jump();
        }
    }
}