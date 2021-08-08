package practice08;


import java.text.MessageFormat;

public class Teacher extends  Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }
    public Klass getKlass() {
        return klass;
    }

    String teacher = super.introduce() + " " + "I am a Teacher. ";

    public String introduce() {
        if (klass != null)
        {
            return MessageFormat.format(teacher + "I teach Class {0}.", klass.getNumber());
        }
        else
            return teacher + "I teach No Class.";
    }

}
