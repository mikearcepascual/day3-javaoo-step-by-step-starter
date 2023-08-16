package ooss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private List<Klass> klass = new ArrayList<>();
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        StringBuilder klassNumbers = new StringBuilder();
        klassNumbers.append(this.klass.stream()
                .map(number -> number.getNumber() + "").collect(Collectors.joining(", ")));
        return super.introduce().concat(String.format(" I am a teacher. I teach Class %s.",klassNumbers));
    }

    public void assignTo(Klass klass) {
        this.klass.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return this.klass.contains(klass);
    }
}
