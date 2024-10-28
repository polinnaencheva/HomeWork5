package oop;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog("Arni", 8, "Black", "Cane Corso");
        Parrot parrot = new Parrot("Polly", 2, "Green", "Macaw", true);

        // Действия за кучето
        dog.makeSound();
        dog.feed();
        dog.sleep();
        dog.expressHappiness();
        dog.followCommand("fetch");

        // Действия за папагала
        parrot.makeSound();
        parrot.fly();
        parrot.feed();
        parrot.repeatWords("I am a parrot!");
    }
}


