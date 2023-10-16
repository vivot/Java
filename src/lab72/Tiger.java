package lab72;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger() {
        this.randomSpeed = new SecureRandom().nextInt( 101 );

    }


    @Override
    public int getRandomSpeed() {
        return super.getRandomSpeed();
    }

    @Override
    public String getAnimalName() {
        return "Tiger";
    }

    @Override
    public void setRandomSpeed(int randomSpeed) {
        this.randomSpeed = new SecureRandom().nextInt( 101 );

    }
}
