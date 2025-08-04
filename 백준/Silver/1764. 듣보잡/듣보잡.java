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

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> list1 = new HashSet<>();
        for (int i = 0; i < N; i++) {
            list1.add(br.readLine());
        }

        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (list1.contains(name)) {
                list2.add(name);
            }
        }
        Collections.sort(list2);

        System.out.println(list2.size());

        for (String name : list2) {
            System.out.println(name);
        }
    }
}