package practice06;

import java.text.MessageFormat;

public class Klass {
    public int number;

    public Klass(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public String getDisplayName() {
        return "Class " + number;
    }
}
