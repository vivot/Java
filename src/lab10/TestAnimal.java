package lab10;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add( new Horse() );
        animals.add( new Dog() );
        animals.add( new Tiger() );
        Animal winner = AnimalController.findWinner( animals );
        int winnerSpeed = winner.getRandomSpeed();

        System.out.println( "winner is:" + winner.getAnimalName() );
        System.out.printf( "With speed %d", winnerSpeed );

    }
}
