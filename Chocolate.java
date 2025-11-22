public class Chocolate implements IceCream {
    private String description = "Chocolate Ice Cream";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 2.75; // base cost
    }
}
