package guitarshop;

public class Guitar {
    private double price;
    private String serialNumber;
    private GuitarSpec spec;

    public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = new GuitarSpec(builder, model, type, backWood, topWood);

    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpec getSpec(){
        return this.spec;
    }

}
