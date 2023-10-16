package lab72;

import java.security.SecureRandom;

public class Animal {
    int randomSpeed = new SecureRandom().nextInt();
    String animalName;

    public Animal() {
        SecureRandom random = new SecureRandom();
        randomSpeed = random.nextInt();
    }


    public int getRandomSpeed() {
        return randomSpeed;
    }

    public String getAnimalName() {
        return "Animal";
    }

    public void setRandomSpeed(int randomSpeed) {
        this.randomSpeed = randomSpeed;
    }
}
