// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class 1
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Sound of cow is Moo");
    }
}

// Child class 2
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Sound of dog is Bow");
    }
}

// Main class
public class Animal_sound {

    public static void main(String[] args) {

        System.out.println("Sounds of animals: ");

        Animal a;

        a = new Cow();   // polymorphism
        a.sound();

        a = new Dog();   // polymorphism
        a.sound();
    }
}
