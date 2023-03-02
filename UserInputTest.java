import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputTest {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter number");
        // int num = System.in.read();
        // System.out.println(num -48);

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num1 = Integer.parseInt(bf.readLine());
        // System.out.println(num1);
        // bf.close();

        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        System.out.println(num3);
        sc.close();
    }
}
