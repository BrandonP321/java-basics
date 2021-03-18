package compositionEncapsulationPolymorphism.src;

public class Jaws extends Movie {
    public String plot;

    public Jaws(String name, String plot) {
        super(name);
        this.plot = plot;
    }

    @Override
    public String plot() {
        return this.plot;
    }
}
