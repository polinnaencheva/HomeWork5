package oop;

public class Parrot extends Pet {
    private String species;
    private boolean canTalk;

    public Parrot(String name, int age, String color, String species, boolean canTalk) {
        super(name, age, color);
        setSpecies(species);
        setCanTalk(canTalk);
    }

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            if (species != null && !species.trim().isEmpty()) {
                this.species = species;
            } else {
                throw new IllegalArgumentException("Species cannot be empty or null.");
            }
        }

        public boolean isCanTalk() {
            return canTalk;
        }

        public void setCanTalk(boolean canTalk) {
            this.canTalk = canTalk;
        }

    @Override
    public void makeSound() {
        if (canTalk) {
            System.out.println(name + " says: Hello!");
        } else {
            System.out.println(name + " makes a squawking sound.");
        }
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }
    public void repeatWords(String words) {
        if (canTalk) {
            System.out.println(name + " repeats: " + words);
        } else {
            System.out.println(name + " cannot talk.");
        }
    }

}




