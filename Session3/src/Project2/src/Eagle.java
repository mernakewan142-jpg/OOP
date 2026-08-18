public class Eagle extends Animal implements Flyable{
    public Eagle(int age, String name, String species) {
        super(age, name, species);
    }


    @Override
    public void fly() {
        System.out.println(getName() + "is flying");
    }
}
