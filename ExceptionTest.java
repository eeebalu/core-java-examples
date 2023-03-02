class CustomException extends Exception {
    public CustomException(String msg) {
        super(msg);
    }
} 
public class ExceptionTest {
    public static void main(String[] args) {
        int nums[] = new int[5];
        int i = 3;
        int j = 0;
        String str = null;
        try {
            if (j==0) {
                // throw new ArithmeticException("I don't want zero in devided by method");
                throw new CustomException("CustomException messsage devided by zero");
            }
            System.out.println(i/j);
            System.out.println(nums[5]);
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Canot devide by zero!");
        } catch (CustomException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You are going out of array boundaries!");
        } catch (Exception e) {
            System.out.println("Random exception: " + e);
        }
        System.out.println("After exception continue execution...");
    }
}
