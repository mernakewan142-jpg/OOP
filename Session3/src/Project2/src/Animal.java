public class Animal {
    private String name;
    private int age;
    private String Species;

    public Animal(int age, String name, String species) {
        this.age = age;
        this.name = name;
        this.Species = species;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        this.Species = species;
    }

    public void eat() {
        System.out.println(name + "is eating");
    }

        void displayAnimalInfo () {
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Species : " + Species);
        }


    }

