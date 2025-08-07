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

        int n = Integer.MAX_VALUE;
        int primeCount = 0;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            for (int i = n + 1; i <= 2 * n; i++ ) {
                if (isPrime(i)) {
                    primeCount++;
                }
            }
            System.out.println(primeCount);
            primeCount = 0;
        }
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }

        long sqrt = (long) Math.sqrt(n);

        for (long i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}