package practice09;

import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.stream.Collectors;

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

    String teacher = super.introduce() + " " + "I am a Teacher. ";

    public String introduce() {
        if (klass != null)
        {
            return MessageFormat.format(teacher + "I teach Class {0}.", klass.stream().map(klassVal -> String.valueOf(klassVal.getNumber())).collect(Collectors.joining(", ")));
        }
        else
            return teacher + "I teach No Class.";
    }
}
