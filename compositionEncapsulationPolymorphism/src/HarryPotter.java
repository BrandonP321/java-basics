package compositionEncapsulationPolymorphism.src;

public class HarryPotter extends Movie {
    private String plot;

    public HarryPotter(String name, String plot) {
        super(name);
        this.plot = plot;
    }

    @Override
    public String plot() {
        return this.plot;
    }
}
