// Main2.java
public class Main2 {
    public static void main(String[] args) {
        // Creating objects of Herbivores, Carnivores, and Omnivores
        Animal herbivore = new Herbivores();
        Animal carnivore = new Carnivores();
        Animal omnivore = new Omnivores();
        
        // Calling the eat() method via the Animal reference
        herbivore.eat();  // Outputs: Herbivore eats plants.
        carnivore.eat();  // Outputs: Carnivore eats meat.
        omnivore.eat();   // Outputs: Omnivore eats both plants and meat.
    }
}
