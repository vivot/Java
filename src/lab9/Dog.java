package lab9;

import java.security.SecureRandom;

public class Dog extends Animal {
    public Dog() {
        this.randomSpeed = new SecureRandom().nextInt( 61 );
        this.hasWings = true;

    }

    @Override
    public String getAnimalName() {
        return "Dog";
    }


}
