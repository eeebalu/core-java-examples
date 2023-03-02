// Final variable, final method, final class

class FnCalc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public void show() {
        System.out.println("In FnCalc!");
    }
}

final class FnAdvCalc extends FnCalc {
    public int add(int n1, int n2) {
        return n1 + n2 + 2;
    }
    public void show() {
        System.out.println("In FnAdvCalc!");
    }
}

public class CastingTest {
    public static void main(String args[]) {
        final int num = 8;
        System.out.println(num);

        FnCalc obj1 = (FnCalc) new FnAdvCalc(); // Upcasting
        System.out.println(obj1.add(2,3));
        obj1.show();
        System.out.println(obj1);

        FnCalc obj2 = (FnAdvCalc) new FnAdvCalc(); // Upcasting - implicitly casting to FnCalc
        obj2.show(); 

        FnAdvCalc obj3 = (FnAdvCalc) obj1; // Downcasting
        obj3.show();
    }
}
