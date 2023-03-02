class OuterCls {
    public void show() {
        System.out.println("Inside OuterCls!");
    }
}
public class InnerClassTest {
    public static void main(String args[]) {
        OuterCls obj = new OuterCls() // anonymous inner class
        {
            public void show() {
                System.out.println("Inside anonymous inner class!!!");
            }
        };
        obj.show();
    }
}
