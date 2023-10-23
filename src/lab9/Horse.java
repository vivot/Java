package lab9;

import java.security.SecureRandom;

public class Horse extends Animal {
    public Horse() {
        this.randomSpeed = new SecureRandom().nextInt( 71 );


    }

    @Override
    public String getAnimalName() {
        return "Horse";
    }
}
