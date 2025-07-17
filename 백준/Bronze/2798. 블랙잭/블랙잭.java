import java.io.*;
import java.util.*;

public class Main {
    static final boolean DEBUG = false;

    public static void main(String[] args) throws Exception {
        Scanner sc;
        if (DEBUG) {
            sc = new Scanner(new File("src/input.txt"));
        } else {
            sc = new Scanner(System.in);
        }

        int n = sc.nextInt();
        int maxNum = sc.nextInt();
        int sum = 0;

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for  (int k = j + 1; k < n; k++) {
                    if (maxNum >= nums[i] + nums[j] + nums[k])
                        if ( sum <= nums[i] + nums[j] + nums[k])
                            sum = nums[i] + nums[j] + nums[k];
                }
            }
        }

        System.out.println(sum);
    }
}