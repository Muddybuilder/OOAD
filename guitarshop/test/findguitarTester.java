package guitarshop.test;

import guitarshop.Guitar;
import guitarshop.Inventory;

public class findguitarTester {

    public static void main(String[] args){
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar whatIWant = new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");
        Guitar guitar = inventory.search(whatIWant);

        if (guitar != null){
            System.out.println("You might like this: " +
            "Build: " + guitar.getBuilder() + " "+
            "Type: "+guitar.getType() + " "+
            "Back: "+guitar.getBackWood() + " " +
            "Top: "+guitar.getTopWood()+ " "+
            "Price: "+guitar.getPrice());
        }
        else{
            System.out.println("Sorry, no match found.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("123zc213f", 12313.4, "Custom", "MDK-2", "Electric", "Alder", "Alder");
        inventory.addGuitar("321ff", 1399.89, "fender", "Stratocastor", "electric", "Alder", "Alder");

    }
    

}
