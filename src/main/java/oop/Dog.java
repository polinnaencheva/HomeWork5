package oop;

public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        setBreed(breed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed != null && !breed.trim().isEmpty()) {
            this.breed = breed;
        } else {
            throw new IllegalArgumentException("Breed cannot be empty or null.");
        }
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching a ball.");
    }
    public void followCommand(String command) {
        if (command.equalsIgnoreCase("sit")) {
            System.out.println(name + " sits down.");
        } else if (command.equalsIgnoreCase("stay")) {
            System.out.println(name + " stays.");
        } else if (command.equalsIgnoreCase("fetch")) {
            fetch();
        } else {
            System.out.println(name + " doesn't understand the command.");
        }
    }
}


