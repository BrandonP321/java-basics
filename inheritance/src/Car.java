package inheritance.src;

import java.lang.reflect.Constructor;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, double size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int gear) {
        this.currentGear = gear;
        System.out.println("Now in gear " + gear);
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
    }
}
