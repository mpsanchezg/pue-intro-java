package cl.sangut.intro.java.module2;

import cl.sangut.intro.java.module2.class2.Class2Exercise1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Class2Exercise1 class2Exercise1 = new Class2Exercise1("Juan", 25, 1.75, 'P', true);

        System.out.println("Name: " + class2Exercise1.getName());
        System.out.println("Age: " + class2Exercise1.getAge());
        System.out.println("Height: " + class2Exercise1.getHeight());
        System.out.println("Last Name Initial: " + class2Exercise1.getLastNameInitial());
        System.out.println("Is Matriculated: " + class2Exercise1.isMatriculated());
    }
}
