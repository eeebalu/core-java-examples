@FunctionalInterface
interface IntA {
    int add(int i, int j);
}
public class LambdaTest {
    public static void main(String[] args) {
        IntA obj = (i, j) -> i+j;
        System.out.println(obj.add(13,34));
    }
}
