public class Main {

    public static void main(String[] args) {

        Eagle eagle = new Eagle(3 , "joy" , "eagle");
        Fish fish = new Fish(2 , "Nimo" , "fish");
        Lion lion =  new Lion(2 , "Mofasa" , "lion");
        Bat bat =  new Bat(5 , "paty" , "Bat");
        Penguin penguin = new Penguin(3 , "Pingo" , "Penguin");
        Dolphin dolphin = new Dolphin( 6 , "Dolly" , "Dolphin");
        Dog dog = new Dog(4 , "Boby" , "Dog");

        Animal[] animals = {
                lion,
                eagle,
                fish,
                bat,
                penguin,
                dog,

        };

        for (Animal animal : animals) {

            System.out.println("**************************");

            animal.displayAnimalInfo();
            animal.eat();
        }

        System.out.println("****************************");
        eagle.fly();
        bat.fly();

        fish.swim();
        penguin.swim();
        dolphin.swim();
        dog.swim();
    }
}
