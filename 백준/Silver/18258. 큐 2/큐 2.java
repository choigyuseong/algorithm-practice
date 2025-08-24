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

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    stack.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(stack.isEmpty()
                            ? -1
                            : stack.poll()
                    ).append('\n');
                    break;
                case "size":
                    sb.append(stack.size()).append('\n');
                    break;
                case "empty":
                    sb.append(stack.isEmpty()
                            ? 1
                            : 0
                    ).append('\n');
                    break;
                case "front":
                    sb.append(stack.isEmpty()
                            ? -1
                            : stack.peek()
                    ).append('\n');
                    break;
                case "back":
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