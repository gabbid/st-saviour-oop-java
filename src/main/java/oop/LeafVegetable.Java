// Parent Class (LeafVegetable + Washable)
public class LeafVegetable extends Vegetable implements Washable {
    private String leafType;

    public LeafVegetable(String name, double weight, String leafType) {
        super(name, weight);
        this.leafType = leafType;
    }

    public String getLeafType() { 
        return leafType; 
    }

    public void setLeafType(String leafType) { 
        this.leafType = leafType; 
    }

    // Implements the Interface
    public String wash() {
        return("Washing " + this.getName() + " leaves.");
    }

    public String harvest() {
        return("Harvesting leaf vegetable: " + this.getName());
    }

    public String pluck() {
        return(this.getName() + " leaves are being plucked.");
    }
}