import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int val[] = new int[n];
        int wt[] = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }
        int tar = sc.nextInt();

        int dp[][] = new int[n + 1][tar + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][tar]);
    }
}