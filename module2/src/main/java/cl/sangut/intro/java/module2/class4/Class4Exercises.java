package cl.sangut.intro.java.module2.class4;

import java.util.Locale;
import java.util.Scanner;

public class Class4Exercises {
    static void main() {
        Class4Exercises exercises = new Class4Exercises();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Ejercicio 13: Validar si un usuario es mayor de edad
        System.out.println("Introduce tu edad: ");
        int age = scanner.nextInt();
        System.out.println("Eres mayor de edad? " + exercises.isAdult(age));

        // Ejercicio 14: Solicitar numero entero y validar si es par
        System.out.println("Introduce un numero entero: ");
        int number = scanner.nextInt();
        System.out.println("El numero es par? " + exercises.isEven(number));

        // Ejercicio 15: Ejercicio 15: Solicita una nota y crea una expresión booleana que indique
        // si está entre 0 y 10, ambos incluidos.
        System.out.println("Introduce una nota: ");
        double grade = scanner.nextDouble();
        System.out.println("La nota es válida? " + exercises.isValidGrade(grade));

        // Ejercicio 17: Solicita un usuario y compáralo con uno de referencia mediante
        // equals() y equalsIgnoreCase().
        scanner.nextLine();
        System.out.println("Introduce un usuario: ");
        String userInput = scanner.nextLine();
        String referenceUser = "admin";
        System.out.println("El usuario es igual al de referencia? " + (
                userInput.equals(referenceUser) || userInput.equalsIgnoreCase(referenceUser)
        ));
    }

    public boolean isAdult(int age) {
        return age >= 18;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isValidGrade(double grade) {
        return grade >= 0 && grade <= 10;
    }
}
