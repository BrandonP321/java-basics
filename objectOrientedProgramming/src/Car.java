package objectOrientedProgramming.src;

import java.lang.reflect.Constructor;

import jdk.nashorn.internal.objects.annotations.Setter;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public static void main(int doors, int wheels, String model, String engine, String color) {
        
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return this.doors;
    }
}
