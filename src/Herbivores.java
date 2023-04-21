public abstract class Herbivores extends MarineAnimal {

    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Sea grass";
    }
}
