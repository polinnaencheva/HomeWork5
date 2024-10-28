package oop;

public class Pet {
    protected String name;
    protected int age;
    protected String color;
    protected boolean isHungry;

    public Pet(String name, int age, String color) {
        setName(name);
        setAge(age);
        setColor(color);
        this.isHungry = true;
    }

    // Getters и Setters с валидация
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name can't be empty or null.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {  // Валидация: възрастта трябва да е 0 или положителна
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be non-negative.");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.trim().isEmpty()) {
            this.color = color;
        } else {
            throw new IllegalArgumentException("Color cannot be empty or null.");
        }
    }
    public boolean isHungry() {
        return isHungry;
    }

    public void feed() {
        if (isHungry) {
            System.out.println(name + " is being fed.");
            isHungry = false;
        } else {
            System.out.println(name + " is not hungry.");
        }
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
        isHungry = true;  // След сън домашният любимец отново е гладен
    }

    public void expressHappiness() {
        System.out.println(name + " is wagging its tail (or expressing happiness in its own way).");
    }

    public void makeSound() {
        System.out.println("Pet makes a sound.");
    }
}

