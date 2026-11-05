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

    public void displayProductInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Available Units: " + availableUnits);
        System.out.println("In Offer: " + (isInOffer ? "Yes" : "No"));
    }
}
