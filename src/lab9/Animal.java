package lab9;

import java.security.SecureRandom;

public class Animal {
    protected int randomSpeed = new SecureRandom().nextInt();
    protected String name;
    protected boolean hasWings;

    private Animal(Builder builder) {
        this.name = builder.name;
        this.randomSpeed = builder.randomSpeed;
        this.hasWings = builder.hasWings;
    }

    public String getName() {
        return name;
    }

    public int getRandomSpeed() {
        return randomSpeed;
    }

    public boolean hasWings() {
        return hasWings;
    }


    public static class Builder {
        private String name = "Animal";
        private int randomSpeed = new SecureRandom().nextInt( 120 );
        private boolean hasWings = false;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRandomSpeed(int randomSpeed) {
            this.randomSpeed = randomSpeed;
            return this;
        }

        public Builder setHasWings(boolean hasWings) {
            this.hasWings = hasWings;
            return this;
        }

        public Animal build() {
            return new Animal( this ) {

            };
        }
    }
}
