// Final variable, final method, final class

class FnCalc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public final void show_final() { // Final method
        System.out.println("In FnCalc!");
    }
    public void show() {
        System.out.println("In FnCalc!");
    }
}

final class FnAdvCalc extends FnCalc { // Final class
    public int add(int n1, int n2) {
        return n1 + n2 + 2;
    }
    public void show() {
        System.out.println("In FnAdvCalc!");
    }
}

public class FinalTest {
    public static void main(String args[]) {
        final int num = 8; // Final variable
        System.out.println(num);

        FnCalc obj = (FnCalc) new FnAdvCalc(); // Upcasting
        System.out.println(obj.add(2,3));
        obj.show_final();
    }
}
