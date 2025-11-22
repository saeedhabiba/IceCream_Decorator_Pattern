public class WhippedCream extends ToppingDecorator {
    public WhippedCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Whipped Cream";
    }

    @Override
    public double cost() {
        return iceCream.cost() + 0.35;
    }
}
