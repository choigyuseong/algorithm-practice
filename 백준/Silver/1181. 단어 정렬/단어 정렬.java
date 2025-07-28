import java.io.*;
import java.util.*;

public class Main {
    static final boolean DEBUG = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = DEBUG
                ? new BufferedReader(new FileReader("src/input.txt"))
                : new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, (w1, w2) ->
                w1.length() != w2.length()
                        ? w1.length() - w2.length()
                        : w1.compareTo(w2)
        );

        StringBuilder sb = new StringBuilder();

        String doubleWord = "";
        for (String word : words) {
            if( !word.equals(doubleWord) ) {
                if ( !word.isEmpty()) {
                    sb.append(word).append('\n');
                }
                doubleWord = word;
            }
        }
        System.out.println(sb);
    }
}