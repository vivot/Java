package lab10;

import java.security.SecureRandom;

public class Horse extends Animal {

    public Horse() {
        super();
    }

    @Override
    public String getAnimalName() {
        return "Horse";
    }

    @Override
    public int generateRandomSpeed() {
        SecureRandom random = new SecureRandom();
        return random.nextInt( 76 );
    }


}
