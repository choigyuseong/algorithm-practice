import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static final boolean DEBUG = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = DEBUG
                ? new BufferedReader(new FileReader("src/input.txt"))
                : new BufferedReader(new InputStreamReader(System.in));

        int N =  Integer.parseInt(br.readLine());

        int[] trees = new int[N];
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        int totalDis = trees[trees.length - 1] - trees[0];

        int totalGcd = -1;
        for (int i = 1; i < N; i++) {
            int treeDis = trees[i] - trees[i - 1];
            totalGcd = totalGcd == -1
                    ? treeDis
                    : gcd(totalGcd, treeDis);
        }

        int totalTree = totalDis / totalGcd + 1;
        int needTree = totalTree - trees.length;
        System.out.println(needTree);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}