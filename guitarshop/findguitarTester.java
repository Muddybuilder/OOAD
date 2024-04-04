package guitarshop;

public class findguitarTester {

    public static void main(String[] args){
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar whatIWant = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
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
        inventory.addGuitar("123zc213f", 12313.4, Builder.ANY, "MDK-2", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("321ff", 1399.89, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

    }
    

}
