import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prices[] = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }

        int bd = 0;
        int sd = 0;
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                sd++;
            } else {
                profit += prices[sd] - prices[bd];
                bd = i;
                sd = i;
            }
        }
        profit += prices[sd] - prices[bd];
        System.out.println(profit);
    }

}