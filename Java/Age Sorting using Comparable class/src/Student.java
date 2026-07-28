public class Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student that) {
        return this.age > that.age ? 1:-1;
    }

//    @Override
//    public int compareTo(Student that) {
//        return this.name.compareToIgnoreCase(that.name);
//    }

//    @Override
//    public int compareTo(Student other) {
//        int len = Math.min(this.name.length(), other.name.length());
//
//        for (int i = 0; i < len; i++) {
//            char c1 = Character.toLowerCase(this.name.charAt(i));
//            char c2 = Character.toLowerCase(other.name.charAt(i));
//
//            if (c1 < c2)
//                return -1;
//            if (c1 > c2)
//                return 1;
//        }
//
//        if (this.name.length() < other.name.length())
//            return -1;
//        if (this.name.length() > other.name.length())
//            return 1;
//
//        return 0;
//    }
}
