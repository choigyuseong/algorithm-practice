import java.io.*;
import java.util.*;

public class Main {
    static final boolean DEBUG = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br;
        if (DEBUG) {
            br = new BufferedReader(new FileReader("src/input.txt"));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String N = br.readLine();
        int[] nums = new int[10];

        for (char c : N.toCharArray()) {
            nums[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            while (nums[i]-- > 0) {
                sb.append(i);
            }
        }

        System.out.println(sb);
    }
}