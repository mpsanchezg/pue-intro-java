package cl.sangut.intro.java.module2;

import cl.sangut.intro.java.module2.class2.Class2Exercise1;
import cl.sangut.intro.java.module2.class2.Class2Exercise2Product;
import cl.sangut.intro.java.module2.class2.Class2Exercise3Schedule;
import cl.sangut.intro.java.module2.class2.Class2Exercise5;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Class2Exercise1 class2Exercise1 = new Class2Exercise1(
                "Juan",
                25,
                1.75,
                'P',
                true
        );


        Class2Exercise2Product product = new Class2Exercise2Product(
                "Laptop",
                999.99,
                10,
                true
        );

        System.out.println("---- Exercise 1 ----");
        System.out.println("Name: " + class2Exercise1.getName());
        System.out.println("Age: " + class2Exercise1.getAge());
        System.out.println("Height: " + class2Exercise1.getHeight());
        System.out.println("Last Name Initial: " + class2Exercise1.getLastNameInitial());
        System.out.println("Is Matriculated: " + class2Exercise1.isMatriculated());
        System.out.println("--------------------");
        System.out.println("---- Exercise 2 ----");
        product.displayProductInfo("USD");
        product.displayProductInfo("EURO");
        System.out.println("--------------------");

        System.out.println("---- Exercise 3 ----");
        Class2Exercise3Schedule schedule = new Class2Exercise3Schedule();
        System.out.println("Hours per day: " + schedule.HOURS_PER_DAY);
        System.out.println("IVA: " + schedule.IVA);
        System.out.println(
                "Days of the week: " +
                        schedule.MONDAY + ", " +
                        schedule.TUESDAY + ", " +
                        schedule.WEDNESDAY + ", " +
                        schedule.THURSDAY + ", " +
                        schedule.FRIDAY + ", " +
                        schedule.SATURDAY + ", " +
                        schedule.SUNDAY
        );
        System.out.println("--------------------");

        String nullableString = null;
        System.out.println("---- Exercise 4 ----");
        System.out.println("Nullable String: " + nullableString);
        nullableString = "Now it has a value!";
        System.out.println("Nullable String: " + nullableString);
        System.out.println("--------------------");

        System.out.println("---- Exercise 5 ----");
        Class2Exercise5 distance = new Class2Exercise5(5, 300);
        System.out.println("Distance in meters: " + distance.convertKilometersToMeters());
        System.out.println("Distance in kilometers: " + distance.convertMetersToKilometers());
        System.out.println("--------------------");
    }
}
