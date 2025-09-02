import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Main {
    static final boolean DEBUG = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = DEBUG
                ? new BufferedReader(new FileReader("src/input.txt"))
                : new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append((int)Math.pow(2, N));
        System.out.println(sb);
    }
}