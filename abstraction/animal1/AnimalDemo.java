package oop_concepts.abstraction.animal1;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myCat.sound();
        myCat.eat();
        myDog.sound();
        myDog.eat();
    }
}
