package cl.sangut.intro.java;

import cl.sangut.intro.java.class1.Class1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final Class1 INSTANCE = new Class1();

    static void main() {
        System.out.println("Hello and welcome!");

        Class1 obj = new Class1();

        int parametro1 = 1;
        int parametro2 = 2;

        int resultado = obj.sumar(parametro1, parametro2);

        INSTANCE.mostrarResultadoSuma(resultado);
    }
}
