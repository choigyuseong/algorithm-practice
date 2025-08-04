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

        String line =  br.readLine();
        int length = line.length();

        Set<String> substrings = new HashSet<>();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                substrings.add(line.substring(i, j));
            }
        }

        System.out.println(substrings.size());
    }
}