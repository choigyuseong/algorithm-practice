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

        int N = sc.nextInt();
        int K = sc.nextInt();

        Integer[] grades = new Integer[N];
        for (int i = 0; i < N; i++) {
            grades[i] = sc.nextInt();
        }

        Arrays.sort(grades, Collections.reverseOrder());

        System.out.println(grades[K-1]);
    }
}