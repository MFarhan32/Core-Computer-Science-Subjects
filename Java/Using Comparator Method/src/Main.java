
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Farhan",21));
        students.add(new Student("Saim",11));
        students.add(new Student("Mahnoor",5));
        students.add(new Student("Arslan",24));

//        Comparator<Student> com = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (o1.age > o2.age) ? 1 : -1;
//            }
//        };

        Comparator <Student> com = (Student o1, Student o2) -> (o1.age > o2.age) ? 1 : -1;


        Collections.sort(students,com);

        for(Student s: students){
            System.out.println(s);
        }
    }
}