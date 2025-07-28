import java.io.*;
import java.util.*;

public class Main {
    static final boolean DEBUG = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = DEBUG
                ? new BufferedReader(new FileReader("src/input.txt"))
                : new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int[] copyNums = nums.clone();
        Arrays.sort(copyNums);

        List<Integer> tempList = new ArrayList<>();
        tempList.add(copyNums[0]);

        for (int i = 1; i < N; i++) {
            if (copyNums[i] != copyNums[i - 1]) {
                tempList.add(copyNums[i]);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int temp = Collections.binarySearch(tempList, nums[i]);
            sb.append(temp).append(" ");
        }

        System.out.println(sb);
    }
}