// Grandparent Class
public abstract class Vegetable {
    public static final boolean isEdible = true;
    protected String name;
    private double weight;

    // Constructor of Vegetable
    public Vegetable(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // Vegetable Class Name Setting
    public String getName() {
        return name;
    }

    public void setName(String name) { 
        this.name = name; 
    }

    // Vegetable Class Weight Setting
    public double getWeight() { 
        return weight; 
    }

    public void setWeight(double weight) { 
        this.weight = weight; 
    }

    // Subclasses for Vegetable 
    public abstract String harvest();
}
