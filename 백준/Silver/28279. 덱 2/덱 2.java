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
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int num = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            switch (command) {
                case 1:
                    num = Integer.parseInt(st.nextToken());
                    stack.offerFirst(num);
                    break;
                case 2:
                    num = Integer.parseInt(st.nextToken());
                    stack.offerLast(num);
                    break;
                case 3:
                    sb.append(stack.isEmpty()
                            ? -1
                            : stack.pollFirst()
                    ).append('\n');
                    break;
                case 4:
                    sb.append(stack.isEmpty()
                            ? -1
                            : stack.pollLast()
                    ).append('\n');
                    break;
                case 5:
                    sb.append(stack.size()).append('\n');
                    break;
                case 6:
                    sb.append(stack.isEmpty()
                            ? 1
                            : 0
                    ).append('\n');
                    break;
                case 7:
                    sb.append(stack.isEmpty()
                            ? -1
                            : stack.peekFirst()
                    ).append('\n');
                    break;
                case 8:
                    sb.append(stack.isEmpty()
                            ? -1
                            : stack.peekLast()
                    ).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}