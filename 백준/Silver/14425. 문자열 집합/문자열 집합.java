    import java.io.*;
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

            Set<String> stringSet = new HashSet<>();
            String[] stringArray = new String[M];

            for (int i = 0; i < N; i++) {
                stringSet.add(br.readLine());
            }

            for (int i = 0; i < M; i++) {
                stringArray[i] = br.readLine();
            }

            int count = 0;

            for (String s : stringArray) {
                if (!s.isEmpty()) {
                    if (stringSet.contains(s)) {
                        count++;
                    }
                }
            }

            System.out.println(count);

        }
    }