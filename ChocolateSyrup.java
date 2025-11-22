public class ChocolateSyrup extends ToppingDecorator {
    public ChocolateSyrup(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Chocolate Syrup";
    }

    @Override
    public double cost() {
        return iceCream.cost() + 0.40;
    }
}
