package practice06;

import java.text.MessageFormat;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return MessageFormat.format(super.introduce() + " I am a Student. I am at Class {0}.", klass.getNumber());
    }

}
