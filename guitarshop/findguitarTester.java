package guitarshop;

import java.util.List;

public class findguitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar whatIWant = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        List<Guitar> guitarList = inventory.search(whatIWant.getSpec());

        for (Guitar guitar : guitarList) {
            GuitarSpec gs = guitar.getSpec();
            System.out.println("You might like this: " +
                    "Build: " + gs.getBuilder() + " " +
                    "Type: " + gs.getType() + " " +
                    "Back: " + gs.getBackWood() + " " +
                    "Top: " + gs.getTopWood() + " " +
                    "Price: " + guitar.getPrice());

        }

    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("123zc213f", 12313.4, Builder.ANY, "MDK-2", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("321ff", 1399.89, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

    }

}
