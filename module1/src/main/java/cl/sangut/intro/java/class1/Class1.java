package cl.sangut.intro.java.class1;

import cl.sangut.intro.java.Main;

public class Class1 {
    // static: permite invocar el método sin crear el objeto
    // void: significa que no devuelve valor
    public int sumar(int parametro1, int parametro2) {
        return parametro1 + parametro2;
    }

    public void mostrarResultadoSuma(int resultado) {
        System.out.println(resultado);
    }
}

/**
 * Funciones o métodos
 *  - Visibilidad: por defecto public
 *  - Resultado: puede existir o no (void o un tipo)
 *  - Nombre
 *  - Parámetros
 * ----------------------------------------------------
 *  estructura:
 * ----------------------------------------------------
 *  visibilidad resultado nombreFuncion(parametro1, parametro2) {
 *      return resultadoDeProcesar(parametro1, parametro2)
 *  }
 * ----------------------------------------------------
 *  ejemplo:
 * ----------------------------------------------------
 * piblic int sumar(int parametro1, int parametro2) {
 *     return parametro1 + parametro2;
 * }
 *
 * java -cp module1/target/classes/ cl.sangut.intro.java.class1.Class1

 * WORA: Write Once Run Anyway
 */