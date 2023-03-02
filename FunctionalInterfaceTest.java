@FunctionalInterface
interface IntA {
    void show();
}

@FunctionalInterface
interface IntB {
    void show(int i);
}

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        IntA obj = new IntA() 
        {
            public void show() {
                System.out.println("Inside ananimous inner class method - show");
            }
        };
        obj.show();

        IntA obj1 = () -> System.out.println("Inside lambda expression method - show");
        obj1.show();

        IntB obj2 = i -> System.out.println("In IntB: " + i);
        obj2.show(13);
    }   
}
