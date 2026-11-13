package cl.sangut.intro.java.module2.class3;

import java.util.Locale;
import java.util.Scanner;

public class Class3ProductStatistics {
    static void main() {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Precio del producto 1 (usa punto decimal): ");
            double price1 = scanner.nextDouble();
            System.out.print("Precio del producto 2 (usa punto decimal): ");
            double price2 = scanner.nextDouble();

            if (!Double.isFinite(price1) || !Double.isFinite(price2) || price1 < 0 || price2 < 0) {
                System.err.println("Error: los precios deben ser finitos y no negativos.");
                return;
            }

            double average = price1 / 2 + price2 / 2;
            double maximum = Math.max(price1, price2);
            double minimum = Math.min(price1, price2);

            System.out.printf(Locale.US, "%nMedia: %.2f%n", average);
            System.out.printf(Locale.US, "Maximo: %.2f%n", maximum);
            System.out.printf(Locale.US, "Minimo: %.2f%n", minimum);
        }
    }
}
