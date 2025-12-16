import java.util.ArrayList;

public class VegTest {
    public static void main(String[] args) {
        ArrayList<Vegetable> garden = new ArrayList<>();
        garden.add(new Carrot("Carrot", 0.2, "sandy", 15.0));
        garden.add(new Spinach("Spinach", 0.1, "broadleaf", 2.7));
        garden.add(new Tomato("Tomato", 0.25, 25, "Roma"));

        for (Vegetable veg : garden) {
            veg.harvest(); // Inherited method

            // Polymorphism validation
            if (veg instanceof Carrot) {
                ((Carrot) veg).dig(); // RootVegetable method
            }
            if (veg instanceof Spinach) {
                ((Spinach) veg).pluck(); // LeafVeg method
                ((Spinach) veg).cook(); // Spinach method
            }
            if (veg instanceof Tomato) {
                ((Tomato) veg).slice(); // FruitVeg method
                ((Tomato) veg).dice(); // Tomato method
            }
        }
    }
}