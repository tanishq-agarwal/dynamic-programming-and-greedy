import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        
        int dp[][] = new int[n+1][tar+1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = 1;
                }
                else if(i == 0){
                    dp[i][j] = 0;
                }
                else if(j == 0){
                    dp[i][j] = 1;
                }
                else {
                    if(arr[i-1] <= j){
                        dp[i][j] = dp[i][j-arr[i-1]] + dp[i-1][j];
                    }
                    else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        System.out.println(dp[n][tar]);
    }
}

