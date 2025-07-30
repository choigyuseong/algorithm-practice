import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static final boolean DEBUG = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = DEBUG
                ? new BufferedReader(new FileReader("src/input.txt"))
                : new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N =  Integer.parseInt(st.nextToken());
        int M =  Integer.parseInt(st.nextToken());

        Map<String, Integer> nameToNum = new HashMap<>();
        Map<Integer, String> numToName = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            numToName.put(i, name);
            nameToNum.put(name, i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String line =  br.readLine();
            if (line.matches("\\d+")) {
                int num = Integer.parseInt(line);
                sb.append(numToName.get(num)).append("\n");
            } else {
                sb.append(nameToNum.get(line)).append("\n");
            }
        }
        System.out.println(sb);
    }
}