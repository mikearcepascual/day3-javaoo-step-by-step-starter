package ooss;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        return super.introduce().concat(" I am a student.");
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public boolean isIn(Klass klass) {
        return klass.equals(this.klass);
    }

    public int getKlass(){
        return this.klass.getNumber();
    }

    public String getName() {
        return this.name;
    }
}
