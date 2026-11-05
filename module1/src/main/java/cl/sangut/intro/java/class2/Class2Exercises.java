package cl.sangut.intro.java.class2;

public class Class2Exercises {
    public void exercice1() {
        exerciseSeparate(2);
        System.out.println("Hello world!");
        exerciseSeparate(2);
    }

    public void exercice2(String name, int age, String city) {
        exerciseSeparate(2);
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Ciudad: " + city);
        exerciseSeparate(2);
    }

    public void exercice3() {
        exerciseSeparate(3);
        System.out.println("Había una vez un programador que quería aprender Java.");
        System.out.println("Se sentó frente a su computadora y comenzó a escribir código.");
        System.out.println("Después de muchas horas de práctica, finalmente logró crear su primer programa en Java.");
        System.out.println("Y así, el programador se convirtió en un experto en Java y vivió feliz para siempre.");
        exerciseSeparate(3);
    }

    public void exercise4(
            String mondaySchedule,
            String tuesdaySchedule,
            String wednesdaySchedule,
            String thursdaySchedule,
            String fridaySchedule
            ) {
        exerciseSeparate(4);
        System.out.println(
                "-- Horario semanal --" +
                "\nLunes: " + mondaySchedule +
                "\nMartes: " + tuesdaySchedule +
                "\nMiércoles: " + wednesdaySchedule +
                "\nJueves: " + thursdaySchedule +
                "\nViernes: " + fridaySchedule
        );
        exerciseSeparate(4);
    }

    public void exercice5() {
        exerciseSeparate(5);
        System.out.println("Hola mundo.");
        System.out.println("Estoy aprendiendo Java!");
        exerciseSeparate(5);
    }

    public void exercice6(
            String name,
            int age,
            String city,
            String profession,
            String company,
            String phone,
            String email
    ) {
        exerciseSeparate(6);
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Ciudad: " + city);
        System.out.printf("Profesión: %s%n", profession);
        System.out.printf("Empresa: %s%n", company);
        System.out.printf("Teléfono: %s%n", phone);
        System.out.printf("Correo electrónico: %s%n", email);
        exerciseSeparate(6);
    }

    private void exerciseSeparate(int number) {
        System.out.printf("------------- Exercise %d -----------------%n", number);
    }
}
