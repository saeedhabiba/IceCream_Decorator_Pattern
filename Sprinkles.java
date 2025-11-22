public class Sprinkles extends ToppingDecorator {
    public Sprinkles(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Sprinkles";
    }

    @Override
    public double cost() {
        return iceCream.cost() + 0.20;
    }
}
