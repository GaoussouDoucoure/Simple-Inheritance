class Animal {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {
        System.out.println("Ruff, ruff!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.setName("Bob");
        Dog dog = new Dog();
        dog.setName("Rubby"); // inherited method
        dog.setBreed("Corgi");
        dog.bark();
        System.out.println(ani.getName());
        System.out.println(dog.getName());
    }
}