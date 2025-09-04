import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static final boolean DEBUG = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = DEBUG
                ? new BufferedReader(new FileReader("src/input.txt"))
                : new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<String> hashSet = new HashSet<String>();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            if (line.equals("ENTER")) {
                count += hashSet.size();
                hashSet.clear();
            }
            else { hashSet.add(line); }
        }
        count += hashSet.size();
        sb.append(count);
        System.out.println(sb);
    }
}