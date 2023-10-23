package lab9;

import java.security.SecureRandom;

public class AnimalWithBuilder {
    private String animalName = "Animal";
    private int randomSpeed = new SecureRandom().nextInt( 120 );
    public boolean hasWings = false;

    protected AnimalWithBuilder(Builder builder) {
        this.animalName = builder.animalName;
        this.randomSpeed = builder.randomSpeed;
        this.hasWings = builder.hasWings;

    }
    // READ ONLY - getter

    public String getAnimalName() {
        return animalName;
    }

    public int getRandomSpeed() {
        return randomSpeed;
    }

    public boolean isWithWings() {
        return hasWings;
    }

    // Inner Class
    public static class Builder {
        private String animalName = "Animal";
        private int randomSpeed;
        private boolean hasWings = false;

        // WRITE ONLY


        public Builder setAnimalName(String animalName) {
            this.animalName = animalName;
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
            return new Animal() {

            };
        }
    }
}
