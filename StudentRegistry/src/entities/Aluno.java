package entities;

public class Aluno {
    private String name;
    private int age;

    public Aluno() {}

    public Aluno(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return getName() +
                ", " +
                getAge() +
                " anos";
    }
}
