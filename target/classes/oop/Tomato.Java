// Child Class (Tomato of FruitVegetable)
public class Tomato extends FruitVegetable {
    private String variety;

    public Tomato(String name, double weight, int seeds, String variety) {
        super(name, weight, seeds);
        this.variety = variety;
    }

    public String getVariety() { 
        return variety; 
    }

    public void setVariety(String variety) { 
        this.variety = variety; 
    }

    public String dice() {
        return("Dicing " + variety + " tomato.");
    }
}