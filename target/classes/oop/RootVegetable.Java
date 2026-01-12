// Parent Class (RootVegetable)
public class RootVegetable extends Vegetable {
    private String soilType;

    // Constructor of RootVegetable
    public RootVegetable(String name, double weight, String soilType) {
        super(name, weight);
        this.soilType = soilType;
    }

    // RootVegetable Class Name Setting
    public String getSoilType() { 
        return soilType; 
    }

    public void setSoilType(String soilType) { 
        this.soilType = soilType; 
    }

    public String dig() {
        return getName() + " is being dug from " + soilType + " soil.";
    }

    // Implement Vegetable Abstract Method
    public String harvest() {
        return "Harvesting root vegetable: " + this.getName();
    }
}
