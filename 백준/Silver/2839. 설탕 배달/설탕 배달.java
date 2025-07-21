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

        int MIN_KG = 3;
        int MAX_KG = 5;
        int count = Integer.MAX_VALUE;

        for (int i = 0; i <= N / MAX_KG; i++) {
            for (int j = 0; j <= N / MIN_KG; j++) {
                if (MAX_KG * i + MIN_KG * j == N) {
                    count = Math.min(count, i + j);
                }
            }
        }

        if (count == Integer.MAX_VALUE) count = -1;

        System.out.println(count);
    }
}