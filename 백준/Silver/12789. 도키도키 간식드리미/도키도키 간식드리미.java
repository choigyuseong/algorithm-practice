import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static final boolean DEBUG = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = DEBUG
                ? new BufferedReader(new FileReader("src/input.txt"))
                : new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> temp = new ArrayDeque<>();

        int N =Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int target = 1;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            while (!temp.isEmpty() && temp.peek() == target) {
                temp.pop();
                target++;
            }

            if (target == num) target++;
            else temp.push(num);
        }

        while (!temp.isEmpty() && temp.peek() == target) {
            temp.pop();
            target++;
        }

        System.out.println(target == N + 1
                ? "Nice"
                :"Sad"
        );
    }
}