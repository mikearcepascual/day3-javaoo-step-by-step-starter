package ooss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        return super.introduce().concat(" I am a teacher.");
    }

    public void assignTo(Klass klass) {
        this.klass = klass;
    }

    public boolean belongsTo(Klass klass) {
        return klass.equals(this.klass);
    }
}
