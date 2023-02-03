package Oops_In_Java;

public class Polymorphism {
    public static void main(String[] args) {
        Animal myanimal=new Animal();
        myanimal.eat();
        Dog mydog=new Dog();
        mydog.eat(3);
        mydog.eat();
        Cat mycat=new Cat();
        mycat.eat();
    }
}
