package inheritance.src;

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("bird", 2, 1, 10, 20);
        Dog dog = new Dog("Bernard", 2, 5, 20, 50);

        animal.eat();
        dog.eat();
    }
}
