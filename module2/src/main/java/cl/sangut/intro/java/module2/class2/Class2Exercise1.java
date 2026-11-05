package cl.sangut.intro.java.module2.class2;

public class Class2Exercise1 {
    String name;
    int age;
    double height;
    char lastNameInitial;
    boolean isMatriculated;

    public Class2Exercise1(String name, int age, double height, char lastNameInitial, boolean isMatriculated) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.lastNameInitial = lastNameInitial;
        this.isMatriculated = isMatriculated;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public char getLastNameInitial() {
        return lastNameInitial;
    }

    public boolean isMatriculated() {
        return isMatriculated;
    }
}
