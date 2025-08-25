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

        int N = Integer.parseInt(br.readLine());
        Deque<int[]> stack = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            int move = Integer.parseInt(st.nextToken());
            stack.offerLast(new int[]{i, move});
        }

        while (stack.size() > 1) {
            int[] deleted = stack.pollFirst();
            sb.append(deleted[0]).append(" ");

            if (deleted[1] > 0) {
                for (int i = 0; i < deleted[1] - 1; i++) {
                    stack.offerLast(stack.pollFirst());
                }
            } else {
                deleted[1] *= -1;
                for (int i = 0; i < deleted[1]; i++) {
                    stack.offerFirst(stack.pollLast());
                }
            }

        }
        sb.append(stack.pollLast()[0]);
        System.out.println(sb);
    }
}