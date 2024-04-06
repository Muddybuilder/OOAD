package guitarshop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backwood,
            Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backwood, topWood);
        this.guitars.add(guitar);
    }

    public List<Guitar> search(GuitarSpec searchGuitarSpec) {
        List<Guitar> matchingList = new LinkedList<Guitar>();
        for (Iterator<Guitar> i = this.guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (searchGuitarSpec.matches(guitar.getSpec())) {
                matchingList.add(guitar);
            }

        }
        return matchingList;
    }

}