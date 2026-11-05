package cl.sangut.intro.java.module1;

import cl.sangut.intro.java.module1.class1.Class1;
import cl.sangut.intro.java.module1.class2.Class2Exercise1;
import cl.sangut.intro.java.module1.class2.Class2Exercise2Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final Class1 INSTANCE = new Class1();

    static void main() {
        System.out.println("Hello and welcome!");

        Class1 obj = new Class1();
        Class2Exercise1 class2Exercise1 = new Class2Exercise1(
                "Maria",
                30,
                "Barcelona",
                "Ingeniera",
                "Hiberus",
                "+34 603 ----",
                "bcn@sangut.cl"
        );

        int parametro1 = 1;
        int parametro2 = 2;

        int resultado = obj.sumar(parametro1, parametro2);

        INSTANCE.mostrarResultadoSuma(resultado);

        class2Exercise1.exercice1();
        class2Exercise1.exercice2();
        class2Exercise1.exercice3();
        class2Exercise1.exercise4(
                "18:00 - 22:00",
                "18:00 - 22:00",
                "18:00 - 22:00",
                "18:00 - 22:00",
                "18:00 - 22:00"
        );
        class2Exercise1.exercice5();
        class2Exercise1.exercice6();
    }
}
