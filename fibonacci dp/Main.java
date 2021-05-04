import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fibn = FibMemorized(n,new int[n+1]);
    System.out.println(fibn);
 }
 public static int FibMemorized(int n, int qb[]){
     if(n==0 || n==1){
         return n;
     }
     if(qb[n] != 0){
         return qb[n];
     }
     int fibnm1 = FibMemorized(n-1,qb);
     int fibnm2 = FibMemorized(n-2,qb);
     int fibn = fibnm1 + fibnm2;
     
     qb[n] = fibn;
     return fibn;
 }

}