package lab10;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger() {
        super();
    }

    @Override
    public String getAnimalName() {
        return "Tiger";
    }

    @Override

    public int generateRandomSpeed() {
        SecureRandom random = new SecureRandom();
        return random.nextInt( 100 );
    }


}
