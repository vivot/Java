package lab72;

import java.security.SecureRandom;

public class Horse extends Animal {


    public Horse() {
        this.randomSpeed = new SecureRandom().nextInt( 76 );


    }
    @Override
    public int getRandomSpeed() {
        return super.getRandomSpeed();
    }

    @Override
    public String getAnimalName() {
        return "Horse";
    }

    @Override
    public void setRandomSpeed(int randomSpeed) {
        this.randomSpeed = new SecureRandom().nextInt(76);

    }



}
