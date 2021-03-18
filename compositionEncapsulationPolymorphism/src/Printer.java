package compositionEncapsulationPolymorphism.src;

// encapsulation example (restricted access to certain components of the class)
public class Printer {
    private int tonerLevel = 0;
    private int pagesPrinted = 0;
    private boolean isDuplex;

    public Printer(boolean isDuplex) {
        this.isDuplex = isDuplex;
    }

    public void printPage() {
        // increment number of pages printed
        this.pagesPrinted++;
        this.tonerLevel--;
        System.out.println("Printed a page");
    }

    public void fillToner() {
        this.tonerLevel = 100;
        System.out.println("Filled toner");
    }
}
