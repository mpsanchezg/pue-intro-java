package cl.sangut.intro.java.module2.class2;

public class Class2Exercise2Product {
    String name;
    double price;
    int availableUnits;
    boolean isInOffer;

    public Class2Exercise2Product(String name, double price, int availableUnits, boolean isInOffer) {
        this.name = name;
        this.price = price;
        this.availableUnits = availableUnits;
        this.isInOffer = isInOffer;
    }

    public void displayProductInfo(
            String currency
    ) {
        price += (isInOffer ? price * 0.1 : 0); // Increase price by 10% if in offer
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + (currency.equals("USD") ? getPriceInDollars() : getPriceInEuros()));
        System.out.println("Available Units: " + availableUnits);
        System.out.println("In Offer: " + (isInOffer ? "Yes" : "No"));
    }

    public String getPriceInEuros() {
        return price + " €";
    }

    public String getPriceInDollars() {
        return "$ " + (price * 1.1);
    }
}
