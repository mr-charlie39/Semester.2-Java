import java.util.Scanner;

class Animal  {
    public void sound() {
        
        System.out.println("The animal makes a sound.");
    }
}

public class Dog extends Animal {
    @Override
    public void sound() {
        super.sound(); 
        System.out.println("The dog barks.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calls the overridden method in Dog
    }
}

