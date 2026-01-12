// Child Class (Carrot of RootVegetable)
public class Carrot extends RootVegetable {
    private double length; // in cm!

    public Carrot(String name, double weight, String soilType, double length) {
        super(name, weight, soilType);
        this.length = length;
    }

    public double getLength() { 
        return length; 
    }

    public void setLength(double length) { 
        this.length = length; 
    }
}
