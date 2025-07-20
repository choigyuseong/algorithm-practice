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

        int[] nums = new int[6];

        for (int i = 0; i < 6; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = -999;  i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (nums[0] * i + nums[1] * j == nums[2] && nums[3] * i + nums[4] * j == nums[5]) {
                    System.out.println(i + " " + j);
                }
            }
        }

    }
}