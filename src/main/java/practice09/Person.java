package practice09;

import java.text.MessageFormat;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int id;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String introduce() {
        return MessageFormat.format("My name is {0}. I am {1} years old.", name, age);
    }
}
