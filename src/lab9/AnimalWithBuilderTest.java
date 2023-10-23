package lab9;

import java.util.ArrayList;
import java.util.List;

import static lab9.AnimalWithBuilder.Builder;

public class AnimalWithBuilderTest {

    public static void main(String[] args) {
        Builder builder = new Builder();
        List<Animal> animalList = new ArrayList<Animal>();
        Animal animal = builder.build();
        animalList.add( new Dog() );
        animalList.add( new Tiger() );
        animalList.add( new Eagle() );
        animalList.add( new Horse() );
        animalList.add( new Falcon() );
        List<Animal> filterAnimal = AnimalController.filterAnimal( animalList );
        Animal winner = AnimalController.findWinner( filterAnimal );
        System.out.println( "Winner is: " + winner.getAnimalName() + " with speed: " + winner.getRandomSpeed() + " has wings is " + winner.hasWings );

    }
}
