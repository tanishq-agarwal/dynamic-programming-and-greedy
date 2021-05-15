import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int dp[][] = new int[k + 1][n];
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j < arr.length; j++) {
                int max = dp[i][j - 1];

                for (int pi = 0; pi < j; pi++) {
                    int ptillim1 = dp[i - 1][pi];
                    int pith = arr[j] - arr[pi];

                    if (ptillim1 + pith > max) {
                        max = ptillim1 + pith;
                    }
                }
                dp[i][j] = max;
            }
        }
        System.out.println(dp[k][n - 1]);
    }

}