package ooss;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        StringBuilder introduce = new StringBuilder();
        introduce.append(super.introduce()
                .concat(String.format(" I am a student.")));
        if(this.klass.isLeader(this)){
            introduce.append(String.format(" I am the leader of class %d.",this.klass.getNumber()));
        }
        else{
            introduce.append(String.format(" I am in class %d.",this.klass.getNumber()));
        }
        return introduce.toString();
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
}
