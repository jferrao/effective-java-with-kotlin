package io.mandrake.effective.item15;

public final class Student {

    final private int age;
    final private String name;

    public Student(final int age, final String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

}
