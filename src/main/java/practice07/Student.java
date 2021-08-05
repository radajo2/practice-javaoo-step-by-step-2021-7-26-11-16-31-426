package practice07;

import java.text.MessageFormat;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }
    public String introduce() {
        return MessageFormat.format(super.introduce() + " I am a Student. I am at Class {0}.", klass.getNumber());
    }

}
