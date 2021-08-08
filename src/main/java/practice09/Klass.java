package practice09;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private int number;
    private Student leader;
    List<Student> students = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student leader) {
        if (students.contains(leader)){
            this.leader = leader;
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }

    public boolean isIn(Student student)
    {
        return this.equals(student.getKlass());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student member) {
        students.add(member);
    }
}
