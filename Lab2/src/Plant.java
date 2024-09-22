public class Plant extends Organism {
    public Plant(String name) {
        super(name);
    }

    @Override
    public void liveOneDay(Ecosystem ecosystem) {
        photosynthesis();
    }

    private void photosynthesis() {
        System.out.printf("Photosynthesis of %s\n", this.getName());
    }
}
