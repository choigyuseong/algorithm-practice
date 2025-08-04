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

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Set<Integer> aSet = new HashSet<>();
        for (int i = 0; i < a; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        Set<Integer> bSet = new HashSet<>();
        for (int i = 0; i < b; i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> copyASet = new HashSet<>(aSet);
        copyASet.removeAll(bSet);

        Set<Integer> copyBSet = new HashSet<>(bSet);
        copyBSet.removeAll(aSet);
        copyASet.addAll(copyBSet);

        System.out.println(copyASet.size());
    }
}