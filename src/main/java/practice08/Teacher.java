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

    public String introduceWith(Student student){
        if (student.getKlass().getNumber() == (this.getKlass().getNumber())) {
            return String.format(teacher + "I teach %s.", student.getName());
        }else
            return String.format(teacher + "I don't teach %s.", student.getName());
    }

}
