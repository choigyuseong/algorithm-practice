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

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int[] totalNums = new int[8001];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            nums[i] = num;
            totalNums[num + 4000]++;
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(nums);

        int sum = Arrays.stream(nums).sum();
        sb.append(Math.round((double)sum / N)).append('\n');

        sb.append(nums[N / 2]).append('\n');

        int max = 0;
        for (int count : totalNums) {
            max = Math.max(max, count);
        }

        List<Integer> modes = new ArrayList<>();
        for (int i = 0; i < totalNums.length; i++) {
            if (totalNums[i] == max) {
                modes.add(i - 4000);
            }
        }

        sb.append((modes.size() > 1)
                ? modes.get(1)
                : modes.get(0)
        ).append('\n');
        sb.append(nums[N - 1] - nums[0]);
        System.out.println(sb);
    }
}