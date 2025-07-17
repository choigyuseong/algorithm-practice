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

        final int target = sc.nextInt();
        int num = 0;

        while (true) {
            num += 1;

            int sum = 0;
            int temp = num;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            sum += num;
            if (target == sum) {
                break;
            }
            if (num == 1000000) {
                num = 0;
                break;
            }

        }
        System.out.println(num);
    }
}