package lab9;

import java.util.ArrayList;
import java.util.List;

public class AnimalWithBuilderTest {

    public static void main(String[] args) {
        List<Animal> animalList=new ArrayList<>();
        Animal tiger = new Animal.Builder().setName("tiger").setRandomSpeed(10).setHasWings(false).build();
        Animal dog = new Animal.Builder().setName("dog").setRandomSpeed(60).setHasWings(false).build();
        Animal eagle = new Animal.Builder().setName("eagle").setRandomSpeed(100).setHasWings(true).build();
        Animal falcon = new Animal.Builder().setName("falcon").setRandomSpeed(100).setHasWings(true).build();
        Animal horse = new Animal.Builder().setName("horse").setRandomSpeed(75).setHasWings(true).build();

        animalList.add( tiger );
        animalList.add( dog );
        animalList.add( eagle );
        animalList.add( falcon );
        animalList.add( horse );

        List<Animal> filterAnimal =AnimalController.filterAnimal( animalList );
        Animal winner =AnimalController.findWinner( filterAnimal );
        System.out.println("Winner is: "+winner.getName()+ "\nWith speed: "+winner.getRandomSpeed());








    }
}
