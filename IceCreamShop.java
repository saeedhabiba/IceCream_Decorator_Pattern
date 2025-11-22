public class IceCreamShop {
    public static void main(String[] args) {
        IceCream order1 = new Vanilla();
        order1 = new Sprinkles(order1);
        order1 = new Nuts(order1);

        printOrder(order1);

        IceCream order2 = new Chocolate();
        order2 = new ChocolateSyrup(order2);
        order2 = new Caramel(order2);
        order2 = new WhippedCream(order2);
        printOrder(order2);

        IceCream order3 = new Vanilla();
        order3 = new Caramel(new ChocolateSyrup(new Sprinkles(order3)));
        printOrder(order3);
    }

    static void printOrder(IceCream iceCream) {
        System.out.printf("Order: %s%n", iceCream.getDescription());
        System.out.printf("Total cost: $%.2f%n%n", iceCream.cost());
    }
}
