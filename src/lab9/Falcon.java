package lab9;

import java.security.SecureRandom;

public class Falcon extends Animal {

    public Falcon() {

        this.randomSpeed = new SecureRandom().nextInt( 99 );
        this.hasWings = true;
        this.animalName = "Falcon";


    }

    @Override
    public String getAnimalName() {
        return "Falcon";
    }


}
