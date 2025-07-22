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

        int N =  Integer.parseInt(br.readLine());

        Integer[] nums = new Integer[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(nums[i]).append('\n');
        }

        System.out.println(sb);
    }
}