import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
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
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append(cal(M, N)).append('\n');
        }
        System.out.println(sb);
    }

    static int[][] dp = new int[31][31];

    public static int cal(int M, int N) {
        if (N == 0 || M == N) return 1;
        if (dp[M][N] > 0) return dp[M][N];
        return dp[M][N] = cal(M-1, N-1) + cal(M-1, N);
    }
}