package inheritance.src;

public class Vehicle {
    private String name;
    private double size;

    private int velocity;
    private int direction;

    public Vehicle(String name, double size) {
        this.name = name;
        this.size = size;
        this.velocity = 0;
        this.direction = 0;
    }

    public void steer(int direction) {
        this.direction += direction;
        System.out.println("steering at " + direction + " degrees");
    }

    public void move(int velocity, int direction) {
        this.velocity = velocity;
        this.direction = direction;
        System.out.println("Moving at " + this.velocity + " at " + this.direction + " degrees");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    
}
