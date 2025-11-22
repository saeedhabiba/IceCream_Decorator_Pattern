public class Vanilla implements IceCream {
    private String description = "Vanilla Ice Cream";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 2.50; // base cost in currency units
    }
}
