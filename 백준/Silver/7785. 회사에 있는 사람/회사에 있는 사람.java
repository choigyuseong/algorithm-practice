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

        int n =  Integer.parseInt(br.readLine());

        Set<String> workers = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            if (status.equals("enter")) {
                workers.add(name);
            } if (status.equals("leave")) {
                workers.remove(name);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String worker : workers) {
            sb.append(worker).append("\n");
        }
        System.out.println(sb);
    }
}