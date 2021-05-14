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

        int bsp = -arr[0];
        int ssp = 0;
        int csp = 0;

        for (int i = 1; i < arr.length; i++) {
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;

            if (csp - arr[i] > bsp) {
                nbsp = csp - arr[i];
            } else {
                nbsp = bsp;
            }
            if (bsp + arr[i] > ssp) {
                nssp = bsp + arr[i];
            } else {
                nssp = ssp;
            }
            if (ssp > csp) {
                ncsp = ssp;
            } else {
                ncsp = csp;
            }
            bsp = nbsp;
            ssp = nssp;
            csp = ncsp;
        }
        System.out.println(ssp);
    }

}