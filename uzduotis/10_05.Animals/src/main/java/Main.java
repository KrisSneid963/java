public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();

        System.out.println();

        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();

        System.out.println();

        NoiseCapable noiseDog = (NoiseCapable) new Dog("Fido");
        noiseDog.makeNoise();

        NoiseCapable noiseCat = (NoiseCapable) new Cat("Garfield");
        noiseCat.makeNoise();

    }
}

