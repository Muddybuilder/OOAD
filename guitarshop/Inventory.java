package guitarshop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backwood,
            Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backwood, topWood);
        guitars.add(guitar);
    }

    public Guitar search(Guitar searchGuitar) {
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();

            if (guitar.getBuilder() != searchGuitar.getBuilder())
                continue;
            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase())))
                continue;
            if (guitar.getType() != searchGuitar.getType())
                continue;
            if (guitar.getBackWood() != searchGuitar.getBackWood())
                continue;
            if (guitar.getTopWood() != searchGuitar.getTopWood())
                continue;
            return guitar;
        }
        return null;
    }

}