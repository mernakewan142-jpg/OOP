public class Penguin extends Animal implements Swimmable{


    public Penguin(int age, String name, String species) {
        super(age, name, species);
    }

    @Override
    public void swim() {
        System.out.println(getName() + "is Swimming");
    }
}
