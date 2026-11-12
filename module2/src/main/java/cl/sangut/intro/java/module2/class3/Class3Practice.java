package cl.sangut.intro.java.module2.class3;

import java.util.Locale;
import java.util.Scanner;

public class Class3Practice {
    static void main() {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Cliente: ");
            String customer = scanner.nextLine();
            System.out.print("Producto 1: ");
            String product1 = scanner.nextLine();
            System.out.print("Precio unitario 1 (usa punto decimal): ");
            double price1 = scanner.nextDouble();
            System.out.print("Unidades 1: ");
            int units1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Producto 2: ");
            String product2 = scanner.nextLine();
            System.out.print("Precio unitario 2 (usa punto decimal): ");
            double price2 = scanner.nextDouble();
            System.out.print("Unidades 2: ");
            int units2 = scanner.nextInt();
            System.out.print("Descuento (%): ");
            double discountPercentage = scanner.nextDouble();

            if (customer.isBlank() || product1.isBlank() || product2.isBlank()) {
                System.err.println("Error: el cliente y los productos no pueden estar vacios.");
                return;
            }
            if (!Double.isFinite(price1) || !Double.isFinite(price2)
                    || price1 < 0 || price2 < 0 || units1 <= 0 || units2 <= 0) {
                System.err.println("Error: los precios deben ser finitos y no negativos; las unidades, positivas.");
                return;
            }
            if (!Double.isFinite(discountPercentage)
                    || discountPercentage < 0 || discountPercentage > 100) {
                System.err.println("Error: el descuento debe estar entre 0 y 100.");
                return;
            }

            double amount1 = price1 * units1;
            double amount2 = price2 * units2;
            double subtotal = amount1 + amount2;
            if (!Double.isFinite(subtotal)) {
                System.err.println("Error: el importe de la compra es demasiado grande.");
                return;
            }
            double discount = subtotal * (discountPercentage / 100);
            double total = subtotal - discount;

            System.out.printf(Locale.US, "%nFACTURA%nCliente: %s%n", customer);
            System.out.printf(Locale.US, "%-20s %10s %8s %12s%n",
                    "Producto", "Precio", "Unidades", "Importe");
            System.out.printf(Locale.US, "%-20s %10.2f %8d %12.2f%n",
                    product1, price1, units1, amount1);
            System.out.printf(Locale.US, "%-20s %10.2f %8d %12.2f%n",
                    product2, price2, units2, amount2);
            System.out.printf(Locale.US, "Subtotal: %.2f%n", subtotal);
            System.out.printf(Locale.US, "Descuento (%.2f%%): %.2f%n", discountPercentage, discount);
            System.out.printf(Locale.US, "Total a pagar: %.2f%n", total);
        }
    }
}
