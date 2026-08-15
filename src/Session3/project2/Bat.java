package Session3.project2;

public class Bat extends Animal implements Flyable{
    public Bat(int age, String name, String species) {
        super(age, name, species);
    }

    @Override
    public void fly() {
        System.out.println(getName() + "is Flying");
    }
}
