import java.util.Random;

public class ArrayTest {
    public static void main(String args[]) {
        System.out.println("Inside ArrayTest");

        int mulNums[][] = new int[3][4]; // Multi dimension array
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                mulNums[i][j] = (int) (Math.random() * 100);
                // System.out.println(mulNums[i][j]);
            }
        }

        System.out.println("Multi dimensional array size: " + mulNums.length);
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                System.out.print(mulNums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enhanced look, multi dimension array size: " + mulNums.length);
        for (int [] num: mulNums) {
            for (int n: num) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        
        int nums[] = new int[4];
        nums[0] = 3;
        nums[1] = 6;
        nums[2] = 8;
        nums[3] = 2;
        System.out.println("Regular for loop, array size: " + nums.length);
        // Regular for loop
        for (int i=0; i<nums.length - 1; i++) {
            System.out.println(nums[i]);
        }
        
        int arr[] = {1,2,4,2}; // Single dimension array
        System.out.println("Enhanced for loop, array size: " + arr.length);
        // Enhanced for loop
        for (int i:arr) {
            System.out.println(i);
        }

        int numsJagged[][] = new int[3][]; // Jagged array
        numsJagged[0] = new int[2];
        numsJagged[1] = new int[4];
        numsJagged[2] = new int[3];

        System.out.println("Setting values of Jagged array.");
        for (int[] ns: numsJagged) {
            for (int nm: ns) {
                nm = (int) (Math.random()*10);
                System.out.print(nm + " ");
            }
            System.out.println();
        }
    }
}
