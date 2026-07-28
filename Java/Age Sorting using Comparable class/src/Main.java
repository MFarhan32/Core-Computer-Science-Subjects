
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Farhan",21));
        students.add(new Student("Ahmed",19));
        students.add(new Student("Saim",11));
        students.add(new Student("Mahnoor",5));
        students.add(new Student("Arslan",24));

        Collections.sort(students);

        for(Student s: students){
            System.out.println(s);
        }
    }
}