public class Main {
    public static void main(String[] args) {
        Ecosystem ecosystem = new Ecosystem();

        ecosystem.addOrganism(new Plant("Grass 1"));
        ecosystem.addOrganism(new Plant("Grass 2"));
        ecosystem.addOrganism(new Plant("Grass 3"));
        ecosystem.addOrganism(new Plant("Grass 4"));


        ecosystem.addOrganism(new Herbivore("Rabbit 1"));
        ecosystem.addOrganism(new Herbivore("Rabbit 2"));

        ecosystem.addOrganism(new Predator("Wolf"));

        ecosystem.simulate(5);
    }
}