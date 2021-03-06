package compositionEncapsulationPolymorphism.src;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading");
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getRamSlots() {
        return ramSlots;
    }
    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }
    public String getBios() {
        return bios;
    }
    public void setBios(String bios) {
        this.bios = bios;
    }
}
