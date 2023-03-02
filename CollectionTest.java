import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class CollectionTest {
    public static void main(String[] args) {
        System.out.println("Inside CollectionTest!");
        Map<String, Integer> students = new HashMap<>();
        students.put("Bala", 12);
        students.put("Kiran", 45);
        students.put("Asha", 7);
        students.put("Kushal", 78);
        System.out.println(students);
        for (String key: students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
        // System.out.println(students.keySet());
        // Map - is part of collection API

        // Collection interface
        Collection<Integer> obj = new ArrayList<Integer>();
        obj.add(8);
        obj.add(5);
        obj.add(7);
        obj.add(2);
        obj.add(9);
        obj.add(6);
        System.out.println(obj);
        for (int i: obj) {
            System.out.println(i);
        }

        //List interface
        List<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(83);
        obj1.add(52);
        obj1.add(71);
        obj1.add(25);
        obj1.add(90);
        obj1.add(67);
        System.out.println("3rd element in ArrayList: " + obj1.get(3));
        for (int i: obj1) {
            System.out.println(i);
        }
        Collections.sort(obj1);
        System.out.println(obj1);

        //Unique Collection interface
        Collection<Integer> obj2 = new HashSet<Integer>();
        obj2.add(52);
        obj2.add(83);
        obj2.add(71);
        obj2.add(52);
        obj2.add(90);
        obj2.add(67);
        System.out.println("Below are HashSet elements!!!");
        for (int i: obj2) {
            System.out.println(i);
        }

        //Unique Sorted Collection interface
        Collection<Integer> obj3 = new TreeSet<Integer>();
        obj3.add(52);
        obj3.add(83);
        obj3.add(71);
        obj3.add(52);
        obj3.add(90);
        obj3.add(67);
        System.out.println("Below are TreeSet elements!!!");
        for (int i: obj3) {
            System.out.println(i);
        }
    }
}
