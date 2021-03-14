package inheritance.src;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
        this.eyes = 2;
        this.legs = 4;
        this.tail = 1;
        
    }

    public Dog() {
        this("Default Name", 1, 25, 50, 100);
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    @Override // modifier for overriding eat() method on superclass
    public void eat() {
        System.out.println("Eating from the Dog subclass");
        // super.eat(); // could be used to call the eat method on the Animal super class
    }

    private void moveLegs(int speed) {
        System.out.println("Moving dogs legs");
    }

    public void walk() {
        System.out.println("Dog is walking");

        move(5); // call move() method on super class (good not to use super.move() since method could have been overwritten)
    }

    public void run() {
        System.out.println("Dog is running");

        move(10);
    }
}
