public class Fish extends Animal implements Swimmable{
    public Fish(int age, String name, String species) {
        super(age, name, species);
    }

    @Override
    public void swim() {
        System.out.println(getName() + "is Swimming");
    }
}
