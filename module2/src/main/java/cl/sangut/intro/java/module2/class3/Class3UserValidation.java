package cl.sangut.intro.java.module2.class3;

import java.util.Scanner;

public class Class3UserValidation {
    static void main() {
        String expectedUser = "admin";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce el usuario: ");
            String user = scanner.nextLine();

            if (expectedUser.equals(user)) {
                System.out.println("Usuario valido.");
            } else {
                System.out.println("Usuario no valido.");
            }
        }
    }
}
