package lab72;

import java.security.SecureRandom;

public class Dog extends Animal {

    public Dog() {
        this.randomSpeed = new SecureRandom().nextInt( 61 );

    }


    @Override
    public String getAnimalName() {
        return "Dog";
    }

    @Override
    public void setRandomSpeed(int randomSpeed) {
        this.randomSpeed = new SecureRandom().nextInt( 61 );

    }

    // The override method does not work until I set value in constructor, why?
    @Override
    public int getRandomSpeed() {
        return super.getRandomSpeed();
    }
}
