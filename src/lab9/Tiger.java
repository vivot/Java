package lab9;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger() {
        this.randomSpeed = new SecureRandom().nextInt( 101 );


    }

    @Override
    public String getAnimalName() {
        return "Tiger";
    }
}
