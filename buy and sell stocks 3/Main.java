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
        int fee = sc.nextInt();

        int bsp = -arr[0];
        int ssp = 0;

        for (int i = 1; i < arr.length; i++) {
            int nbsp = 0;
            int nssp = 0;
            if (ssp - arr[i] > bsp) {
                nbsp = ssp - arr[i];
            } else {
                nbsp = bsp;
            }
            if (bsp + arr[i] - fee > ssp) {
                nssp = bsp + arr[i] - fee;
            } else {
                nssp = ssp;
            }
            bsp = nbsp;
            ssp = nssp;
        }
        System.out.println(ssp);
    }

}