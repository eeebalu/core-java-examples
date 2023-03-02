import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        return this.age > that.age?1:-1;
    }
}
public class ComparatorTest {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
            
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(53);
        nums.add(34);
        nums.add(11);

        Collections.sort(nums, com); // Using Comparator sort based on the last digit
        System.out.println(nums);

        Comparator<String> com1 = new Comparator<String>() {
            public int compare(String n1, String n2) {
                if (n1.length() > n2.length())
                    return 1;
                else
                    return -1;
            }
        };
        List<String> names = new ArrayList<>();
        names.add("Bala");
        names.add("Kunal");
        names.add("Leo");
        names.add("Srinivas");

        Collections.sort(names, com1); // Sort using Comparator using length of the string
        System.out.println(names);

        List<Student> students = new ArrayList<>();
        students.add(new Student(25, "Hari"));
        students.add(new Student(46, "Ram"));
        students.add(new Student(44, "Seetha"));
        students.add(new Student(65, "Bala"));
        students.add(new Student(35, "Krish"));

        Collections.sort(students); // Student class extends Comparable, it had compareTo implemntation.

        for(Student stud: students) {
            System.out.println(stud);
        }

        // Using lambda
        Comparator<Student> com2 = (s1, s2) -> s1.age > s2.age?1:-1;
        List<Student> stds = new ArrayList<>();
        stds.add(new Student(25, "Hari"));
        stds.add(new Student(46, "Ram"));
        stds.add(new Student(44, "Seetha"));
        stds.add(new Student(65, "Bala"));
        stds.add(new Student(35, "Krish"));

        Collections.sort(stds, com2);

        System.out.println("Sorted list based on age using Comparable1");
        for(Student stud: stds) {
            System.out.println(stud);
        }
    }
}
