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

        int mpist = 0;
        int leastsf = arr[0];
        int dp[] = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < leastsf) {
                leastsf = arr[i];
            }
            mpist = arr[i] - leastsf;
            if (mpist > dp[i - 1]) {
                dp[i] = mpist;
            } else {
                dp[i] = dp[i - 1];
            }
        }

        int mpibt = 0;
        int maxat = arr[arr.length - 1];
        int dp1[] = new int[arr.length];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxat) {
                maxat = arr[i];
            }
            mpibt = maxat - arr[i];
            if (mpibt > dp1[i + 1]) {
                dp1[i] = mpibt;
            } else {
                dp1[i] = dp1[i + 1];
            }
        }

        int op = 0;
        for (int i = 0; i < arr.length; i++) {
            if (dp[i] + dp1[i] > op) {
                op = dp[i] + dp1[i];
            }
        }
        System.out.println(op);
    }

}