package practice06;

import java.text.MessageFormat;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }
    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass != null)
        {
            return MessageFormat.format(super.introduce() + " I am a Teacher. I teach Class {0}.", klass.getNumber());
        }
        else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student){
        String teacher = super.introduce() + " " + "I am a Teacher. ";

        if (student.getKlass().getNumber() == (this.getKlass().getNumber())) {
            return String.format(teacher + "I teach %s.", student.getName());
        }else{
            return String.format(teacher + "I don't teach %s.", student.getName());
        }
    }
}
