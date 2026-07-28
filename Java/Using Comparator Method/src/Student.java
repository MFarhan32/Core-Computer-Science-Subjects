public class Student {
    public int age;
    public String name;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return name + " : " + age;
    }


}
