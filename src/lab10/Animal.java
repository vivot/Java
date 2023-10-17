package lab10;

abstract class Animal {
    public int randomSpeed;
    public String animalName;

    public Animal() {
        randomSpeed = generateRandomSpeed();
    }

    public int getRandomSpeed() {
        return randomSpeed;
    }

    public String getAnimalName() {
        return "Animal";
    }

    public abstract int generateRandomSpeed();
}


