/*
Viết một chương trình quản lý trang trại gồm một danh sách các động vật.
Trang trại có lớp động vật gồm Lợn, Vịt, Cá.
Các loài này được phân loại dựa trên khả năng di chuyển bơi hoặc đi bộ.

Viết một phương thức in ra danh sách các đối tượng động vật nào có thể bơi hoặc đi bộ.
 */
import java.util.ArrayList;
import java.util.List;

// Lớp Animal
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Lớp Pig
class Pig extends Animal {
    public Pig(String name) {
        super(name);
    }

    public void walk() {
        System.out.println(getName() + " can walk.");
    }
}

// Lớp Duck
class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    public void walk() {
        System.out.println(getName() + " can walk.");
    }

    public void swim() {
        System.out.println(getName() + " can swim.");
    }
}

// Lớp Fish
class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(getName() + " can swim.");
    }
}

// Lớp Farm
class Farm {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printAnimalsActions() {
        System.out.println("Action of animals: ");
        for (Animal animal : animals) {
            if (animal instanceof Pig) {
                ((Pig) animal).walk();
            } else if (animal instanceof Duck) {
                ((Duck) animal).walk();
                ((Duck) animal).swim();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            }
        }
    }

    public static void main(String[] args) {
        Farm farm = new Farm();

        farm.addAnimal(new Pig("Pig"));
        farm.addAnimal(new Duck("Duck"));
        farm.addAnimal(new Fish("Fish"));

        farm.printAnimalsActions();
    }
}

