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

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            int count = 0;
            boolean valid = true;

            for (char c : line.toCharArray()) {
                if (c == '(') {
                    count++;
                }
                if (c == ')') {
                    if (count <= 0) {
                        valid = false;
                        break;
                    }
                    count--;
                }
            }
            if (valid && count == 0) {sb.append("YES").append('\n');}
            else sb.append("NO").append('\n');
        }
        System.out.println(sb);
    }
}