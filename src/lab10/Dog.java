package lab10;

import java.security.SecureRandom;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    @Override
    public String getAnimalName() {
        return "Dog";
    }

    @Override
    public int generateRandomSpeed() {
        SecureRandom random = new SecureRandom();
        return random.nextInt( 61 );
    }
}