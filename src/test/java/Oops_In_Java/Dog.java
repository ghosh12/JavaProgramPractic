package Oops_In_Java;

public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }

    public void eat() {
        System.out.println("Dog Eating meat");
    }

    public void eat(int numberOfTime) {
        for (int i = 0; i < numberOfTime; i++) {
            System.out.println("Dog Eating food");
        }
    }
}