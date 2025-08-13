import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    static final boolean DEBUG = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = DEBUG
                ? new BufferedReader(new FileReader("src/input.txt"))
                : new BufferedReader(new InputStreamReader(System.in));

        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            boolean valid = true;
            stack.clear();

            if (line.equals(".")) {
                break;
            }

            for (char c : line.toCharArray()) {

                switch (c) {
                    case '(':
                        stack.push(c);
                        break;

                    case '[':
                        stack.push(c);
                        break;

                    case ')':
                        if (stack.isEmpty()) {
                            valid = false;
                            break;
                        }

                        if (stack.peek() == '(') {
                            stack.pop();
                        }

                        else if (stack.peek() != '(') {
                            valid = false;
                        }
                        break;

                    case ']':
                        if (stack.isEmpty()) {
                            valid = false;
                            break;
                        }

                        if (stack.peek() == '[') {
                            stack.pop();
                        }

                        else if (stack.peek() != '[') {
                            valid = false;
                        }
                        break;
                }
            }

            if (valid && stack.isEmpty()) sb.append("yes").append('\n');
            else sb.append("no").append('\n');
        }
        System.out.println(sb);
    }
}