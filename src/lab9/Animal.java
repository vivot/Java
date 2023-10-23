package lab9;

import java.security.SecureRandom;

public class Animal {
    protected int randomSpeed = new SecureRandom().nextInt();
    protected String animalName;
    protected boolean hasWings;

    protected Animal() {

    }

    public int getRandomSpeed() {
        return randomSpeed;
    }

    public String getAnimalName() {
        return "Animal";
    }

    private void setRandomSpeed(int randomSpeed) {
        this.randomSpeed = randomSpeed;
    }

}
