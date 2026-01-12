// Child Class (Spinach of LeafVegetable)
public class Spinach extends LeafVegetable {
    private double iron; // mg per 100g!

    public Spinach(String name, double weight, String leafType, double iron) {
        super(name, weight, leafType);
        this.iron = iron;
    }

    public double getIron() { 
        return iron; 
    }

    public void setIron(double iron) { 
        this.iron = iron; 
    }

    public String cook() {
        return("Cooking spinach with " + iron + "mg iron per 100g.");
    }
}
