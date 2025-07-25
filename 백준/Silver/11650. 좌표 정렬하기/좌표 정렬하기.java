import java.io.*;
import java.util.*;

public class Main {
    static final boolean DEBUG = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = DEBUG
                ? new BufferedReader(new FileReader("src/input.txt"))
                : new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(points, (p1, p2) -> p1[0] != p2[0]
                ? p1[0] - p2[0]
                : p1[1] - p2[1]
        );

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(points[i][0]).append(" ").append(points[i][1]).append("\n");
        }

        System.out.println(sb);

    }
}