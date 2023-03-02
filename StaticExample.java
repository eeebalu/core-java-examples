class Mobile {
    String brand;
    int price;
    static String groupName;

    static { // Static block
        groupName = "Phone";
        System.out.println("Inside static block!!!");
    }
    static String name;
    public void show() {
        System.out.println(brand + " : " + price + " : " + name + " : " + groupName);
    }

    static void showStatic(Mobile obj) { // static method
        System.out.println("Inside the static method!!!");
        System.out.println(obj.brand + " : " + obj.price + " : " + name + " : " + groupName);
    }
}
public class StaticExample {
    public static void main(String args[]) throws ClassNotFoundException {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";
        obj1.show();

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 1500;
        Mobile.name = "SmartPhone11111";
        obj2.show();

        Class.forName("Mobile");

        Mobile.showStatic(obj2);
    }
}
