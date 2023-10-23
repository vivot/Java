package lab9;

import java.util.ArrayList;
import java.util.List;


public class AnimalController {
    // input list all animal -> return list any with racing true only
    public static List<Animal> filterAnimal(List<Animal> animalList) {
        List<Animal> filterAnimal = new ArrayList<>();

        for (Animal animal :
                animalList)
            if (!animal.hasWings) {
                filterAnimal.add( animal );
            }
        return filterAnimal;

    }

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
