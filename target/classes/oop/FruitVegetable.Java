// Parent Class (FruitVegetable)
public class FruitVegetable extends Vegetable {
    private int seeds;

    public FruitVegetable(String name, double weight, int seeds) {
        super(name, weight);
        this.seeds = seeds;
    }

    // FruitVegetable Class Name Setting
    public int getSeeds() { 
        return seeds; 
    }

    public void setSeeds(int seeds) { 
        this.seeds = seeds; 
    }

    public String slice() {
        return("Slicing " + this.getName() + " with " + seeds + " seeds.");
    }
    
    public String harvest() {
        return("Harvesting fruit vegetable: " + this.getName());
    }
}
