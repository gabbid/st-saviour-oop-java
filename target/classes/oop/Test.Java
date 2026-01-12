import java.util.ArrayList;

// Test!

public class VegTest {
    public static void main(String[] args) {
        
    // Array list w/ different type of veggies.
    ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();
    
    // Setting Carrot.
    String carrotName = "Carrot";
    double carrotWeight = 0.2;
    String carrotSoil = "Dirty";
    double carrotLength = 15.0;
    Carrot carrot = new Carrot(carrotName, carrotWeight, carrotSoil, carrotLength);
        
    // Setting Tomato.
    String tomatoName = "Tomato";
    double tomatoWeight = 0.25;
    String tomatoVariety = "Cherry";
    int tomatoSeeds = 50;
    Tomato tomato = new Tomato(tomatoName, tomatoWeight, tomatoSeeds, tomatoVariety);
        
    // Setting Spinach.
    String spinachName = "Spinach";
    double spinachWeight = 0.10;
    String spinachLeafType = "Roma";
    double spinachIron = 2.6;
    Spinach spinach = new Spinach(spinachName, spinachWeight, spinachLeafType, spinachIron);

    // Adding to Array List.
    vegetable.add(carrot);
    vegetable.add(tomato);
    vegetable.add(spinach);

    // Check for existence & compare!
    boolean found = false;
    for (int i = 0; vegetableList.size(); i++) {
    Vegetable v = vegetableList.get(i);
    if (v.getName().equals("Spinach")) { 
        found = true;
        }
    }
    if (found) {
    return("Spinach is in the vegetable list!");
    } else {
    return("Spinach is NOT in the vegetable list!");
    }

    // Show polymorphism, instanceof, and inherited methods.
    for (int = 0; vegetableList.size(); i++) {
        Vegetable v = vegetableList.get(i);
        } 
           
    // Calls the appropriate subclass method (polymorphism).
    return("Name: " + v.getName() + ", Weight: " + v.getWeight());
    // Shows Polymorphism.
    return(v.harvest());

    // Demonstrate instanceof and interface method calling it.
    if (v instanceof Washable) {
        return(((Washable)v).wash());
        }

    // Demonstrate subclass-specific methods with instanceof calling it.
    if (v instanceof RootVegetable) {
        return(((RootVegetable)v).dig());
        }
            
    if (v instanceof FruitVegetable) {
        return(((FruitVegetable)v).slice());
        }
            
    if (v instanceof Spinach) {
        return(((Spinach)v).cook());
        }
    }

    // Demonstrate wrong answers Eg: Negative weight.
    if (carrot.getWeight() < 1);
    return("Please put a postive number!")

    // Demonstrate all veggies.
    return("All vegetables are edible: " + Vegetable.isEdible);

        
    }
}