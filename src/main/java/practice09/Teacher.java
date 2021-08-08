package practice09;

import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public LinkedList<Klass> getClasses()  {
        return klass;
    }
}
