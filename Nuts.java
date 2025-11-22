public class Nuts extends ToppingDecorator {
    public Nuts(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Nuts";
    }

    @Override
    public double cost() {
        return iceCream.cost() + 0.50;
    }
}
