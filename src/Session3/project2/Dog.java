package Session3.project2;

public class Dog extends Animal implements Swimmable{

    public Dog(int age, String name, String species) {
        super(age, name, species);
    }

    @Override
    public void swim() {
        System.out.println(getName() + "is Swimming");
    }
}
