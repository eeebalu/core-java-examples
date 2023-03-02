interface IntA {
    String name = "Bala - interface A"; // By default final and static
    int age = 34; // By default final and static
    void show(); // By default public abstract
    void config(); // By default public abstract
}
interface IntX {
    public void run(); // By default public abstract
}
interface IntY extends IntX {

}
class IntImp  implements IntA, IntY {
    public void run() {
        System.out.println("Inside run");
    }

    public void show() {
        System.out.println("Inside show");    
    }

    public void config() {
        System.out.println("Inside config");    
    }
}

public class InterfaceTest {
    public static void main(String args[]) {
        IntA obj;
        obj = new IntImp();
        obj.config();
        obj.show();

        IntX obj2 = (IntImp) obj;
        obj2.run();
    }
}
