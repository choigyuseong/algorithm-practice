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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        Deque<Integer> stack = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        for (int i = 1; i <= N; i++) {
            stack.offerLast(i);
        }

        int status = 1;
        while (stack.size() > 1) {
            int num = stack.peek();

            if (status == T) {
                stack.pollFirst();
                sb.append(num).append(", ");
                status = 1;
            }
            else {
                stack.pollFirst();
                stack.offerLast(num);
                status++;
            }
        }
        sb.append(stack.peek()).append('>');
        System.out.println(sb);
    }
}