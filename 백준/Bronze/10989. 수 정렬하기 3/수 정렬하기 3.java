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

        int[] nums = new int[10001];

        for (int i = 0; i < N; i++) {
            nums[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            int n =  nums[i];
            while( n-- > 0 ) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }
}