package lab9;

import java.security.SecureRandom;

public class Eagle extends Animal {


    public Eagle() {
        this.randomSpeed = new SecureRandom().nextInt( 61 );
        this.hasWings = true;
        this.animalName = "Eagle";

    }

    @Override
    public String getAnimalName() {
        return "Eagle";
    }

}
