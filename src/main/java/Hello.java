import java.util.ArrayList;

public class Hello {
    public static void main(String[] args) {
   
public abstract class Vegetable {
    private String name;
    private double weight;

    public Vegetable(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public double getWeight() { 
        return weight; 
    }
    public void setWeight(double weight) { 
        this.weight = weight; 
    }

    // Abstract method to be implemented by subclasses.
    public abstract void harvest();
}

public class RootVegetable extends Vegetable {
    private String soilType;

    public RootVegetable(String name, double weight, String soilType) {
        super(name, weight);
        this.soilType = soilType;
    }

    public String getSoilType() { 
        return soilType; 
    }
    public void setSoilType(String soilType) { 
        this.soilType = soilType; 
    }

    public void dig() {
        System.out.println(getName() + " is being dug from " + soilType + " soil.");
    }

    // Implement abstract method from Vegetable.
    public void harvest() {
        System.out.println("Harvesting root vegetable: " + getName());
    }
}

public class LeafVeg extends Vegetable {
    private String leafType;

    public LeafVeg(String name, double weight, String leafType) {
        super(name, weight);
        this.leafType = leafType;
    }

    public String getLeafType() { 
        return leafType; 
    }

    public void setLeafType(String leafType) { 
        this.leafType = leafType; 
    }

    public void pluck() {
        System.out.println(getName() + " leaves are being plucked.");
    }

    // Implement abstract method from Vegetable.
    public void harvest() {
        System.out.println("Harvesting leaf vegetable: " + getName());
    }
}

public class FruitVeg extends Vegetable {
    private int seeds;

    public FruitVeg(String name, double weight, int seeds) {
        super(name, weight);
        this.seeds = seeds;
    }

    public int getSeeds() { 
        return seeds; 
    }

    public void setSeeds(int seeds) { 
        this.seeds = seeds; 
    }

    public void slice() {
        System.out.println("Slicing " + getName() + " with " + seeds + " seeds.");
    }

    // Implement abstract method from Vegetable.
    public void harvest() {
        System.out.println("Harvesting fruit vegetable: " + getName());
    }
}

public class Carrot extends RootVegetable {
    private double length; // in cm.

    public Carrot(String name, double weight, String soilType, double length) {
        super(name, weight, soilType);
        this.length = length;
    }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
}

public class Spinach extends LeafVeg {
    private double iron; // mg per 100g.

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

    public void cook() {
        System.out.println("Cooking spinach with " + iron + "mg iron per 100g.");
    }
}

public class Tomato extends FruitVeg {
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

    public void dice() {
        System.out.println("Dicing " + variety + " tomato.");
    }
}

    }
}