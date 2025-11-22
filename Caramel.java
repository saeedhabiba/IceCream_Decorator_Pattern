public class Caramel extends ToppingDecorator {
    public Caramel(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Caramel";
    }

    @Override
    public double cost() {
        return iceCream.cost() + 0.45;
    }
}
