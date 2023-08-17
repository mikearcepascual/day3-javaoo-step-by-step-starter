package ooss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private List<Klass> taughtClasses = new ArrayList<>();
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){

        return super.introduce().concat(" I am a teacher.");
    }

    public void assignTo(Klass klass) {
        taughtClasses.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return taughtClasses.contains(klass);
    }

    public boolean isTeaching(Student student) {
        for(Klass klass : taughtClasses){
            if(student.isIn(klass)){
                return true;
            }
        }
        return false;
    }
}
