import java.io.*;
import java.util.*;

public class Main {
    static final boolean DEBUG = false;

    public static void main(String[] args) throws Exception {
        Scanner sc;
        if (DEBUG) {
            sc = new Scanner(new File("src/input.txt"));
        } else {
            sc = new Scanner(System.in);
        }

        int N = sc.nextInt();
        int M = sc.nextInt();

        int min = Integer.MAX_VALUE;

        char[][] chessboard = new char[N][M];

        for (int i = 0 ; i < N ; i++) {
            String line = sc.next();
            for  (int j = 0; j < M; j++) {
                chessboard[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int temp1 = 0;
                int temp2 = 0;

                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        if (( x + y ) % 2 == 0 ) {
                            if (chessboard[x][y] != 'W') temp1++;
                            else temp2 ++;
                        } else {
                            if (chessboard[x][y] != 'B') temp1++;
                            else temp2 ++;
                        }
                    }
                }
                min = Math.min(min, Math.min(temp1, temp2));
            }
        }
        System.out.println(min);
    }
}