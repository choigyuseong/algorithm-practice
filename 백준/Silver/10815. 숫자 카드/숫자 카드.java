import java.io.*;
import java.util.*;

public class Main {
    static final boolean DEBUG = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = DEBUG
                ? new BufferedReader(new FileReader("src/input.txt"))
                : new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<Integer> cardSet = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cardSet.add(Integer.parseInt(st.nextToken()));
        }

        int M =  Integer.parseInt(br.readLine());
        int[] checkNum = new int[M];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            checkNum[i] = Integer.parseInt(st2.nextToken());
        }

        StringBuilder sb =  new StringBuilder();

        for (int num : checkNum) {
            sb.append(cardSet.contains(num)
                    ? "1"
                    : "0"
            ).append(" ");
        }

        System.out.println(sb);
    }
}