package ooss;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private List<Klass> klass = new ArrayList<>();
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        return super.introduce().concat(" I am a teacher.");
    }

    public void assignTo(Klass klass) {
        this.klass.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return this.klass.contains(klass);
    }
}
