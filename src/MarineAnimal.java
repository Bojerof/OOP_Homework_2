public abstract class MarineAnimal implements Speedible {
    private String name;

    public MarineAnimal(String name){
        this.name = name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name: %s, speed: %d, feed: %s", name, speed(), feed());
    }
}
