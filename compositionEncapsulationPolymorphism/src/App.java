package compositionEncapsulationPolymorphism.src;

public class App {
    public static void main(String[] args) throws Exception {
        // computer represents composition ("Has a" relationship)
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, "v2.44");

        PC myPC = new PC(theCase, monitor, motherboard);
        // myPC.getMonitor().drawPixelAt(1500, 1200, "red");
        // myPC.getMotherboard().loadProgram("windows 1.0");
        myPC.powerUp();
    }
}
