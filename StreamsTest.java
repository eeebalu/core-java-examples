import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest {
    public static void main(String[] args) {
        System.out.println("Inside Streams API");
        List<Integer> nums = Arrays.asList(3,4,2,7,4,5);
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0, (c,e) -> c+e);
        System.out.println(result);
        System.out.println("Given values!!!");
        nums.forEach(n -> System.out.println(n));

        System.out.println("Sorted values!!!");
        nums.stream()
            .filter(n -> n%2 == 1)
            .sorted()
            .map(n->n*2)
            .forEach(n -> System.out.println(n)); // Builder pattern

        int resultNum = nums.parallelStream()
                        .filter(n -> n%2 == 1)
                        .map(n->n*2)
                        .reduce(0,(c,e) -> c+e);
        System.out.println("Reduce result!!!");
        System.out.println(resultNum);
    }
}
