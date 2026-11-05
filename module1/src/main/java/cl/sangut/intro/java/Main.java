package cl.sangut.intro.class2;

import cl.sangut.intro.class2.class1.Class1;
import cl.sangut.intro.class2.class2.Class2Exercises;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final Class1 INSTANCE = new Class1();

    static void main() {
        System.out.println("Hello and welcome!");

        Class1 obj = new Class1();
        Class2Exercises class2Exercises = new Class2Exercises(
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

        class2Exercises.exercice1();
        class2Exercises.exercice2();
        class2Exercises.exercice3();
        class2Exercises.exercise4(
                "18:00 - 22:00",
                "18:00 - 22:00",
                "18:00 - 22:00",
                "18:00 - 22:00",
                "18:00 - 22:00"
        );
        class2Exercises.exercice5();
        class2Exercises.exercice6();
    }
}
