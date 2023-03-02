import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryTest {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // int num =0;
        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        //     System.out.print("Enter a number: ");
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }

        int num1 =0;
        BufferedReader br1 = null;
        try {
            br1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter another number: ");
            num1 = Integer.parseInt(br1.readLine());
            System.out.println(num1);
        } finally {
            br1.close();
        }
    }
}
