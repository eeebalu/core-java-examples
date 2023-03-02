class CalculatorOperations {
    public int add(int x, int y) {
        // System.out.println("Inside add method");
        return x + y;
    }
    // Metod overloading
    public int add(int x, int y, int z) {
        // System.out.println("Inside add method");
        return x + y + z;
    }
}
public class Calculator {
    public static void main(String args []) {
        int x = 4;
        int y = 6;
        CalculatorOperations co = new CalculatorOperations();
        System.out.println(co.add(x, y));
        System.out.println(co.add(x, y, 5));
    }

    // Java has Stack and Heap memory
    // Stack stores data - every mehtod has its own stack
    // Stack will have key and value
    // Heap stores objects
    // Local variables are part of Stack
    // Instance variables are part of Heap
    
}
