class A extends Object {
    public A() {
        System.out.println("A object created!!!");
        System.out.println("Inside A");
    }
    public A(int n) {
        System.out.println("Inside A int");
    }
}
class B extends A{
    public B() {
        System.out.println("Inside B");
    }
    public B(int n) {
        super(n);
        System.out.println("Inside B int");
    }
}
public class SuperExample {
    public static void main(String args[]) {
        B b = new B();
        b = new B(2);
        new A(); //Ananimous object there is no reference so we can't reuse them
    }
}
