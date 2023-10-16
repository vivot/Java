package lab72;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {


    // create a method to find max winner from list of Animal
    public static Animal findWinner(List<Animal> animalList) {
        int maxSpeed = 0;
        Animal winner = null;
        for (Animal animal : animalList) {
            int speed = animal.getRandomSpeed();
            if (speed > maxSpeed) {
                maxSpeed = speed;
                winner = animal;
            }

        }
        return winner;
    }


}

