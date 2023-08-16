package ooss;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;

    private final List<Person> attachedPersons = new ArrayList<>();

    public Klass(int number){
        this.number = number;
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
        return number;
    }

    public int getNumber() {
        return number;
    }


    public void assignLeader(Student student) {
        if(student.isIn(this)){
            this.leader = student;
            for(Person person : attachedPersons){
                if(person instanceof Teacher){
                    System.out.println(String.format("I am %s, teacher of Class %d. I know %s become Leader."
                            ,person.getName(),number,student.getName()));
                }
                else if(person instanceof Student && person != student){
                    System.out.println(String.format("I am %s, student of Class %d. I know %s become Leader."
                            ,person.getName(),number,student.getName()));
                }
            }
        }
        else{
            System.out.println("It is not one of us.");
        }
    }

    public boolean isLeader(Student student) {
        return leader.equals(student) ? true : false;
    }

    public void attach(Person person) {
        attachedPersons.add(person);
    }
}
