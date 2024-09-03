package MangMotChieu;

import java.util.Scanner;

public class Bai_5 {
    //chen mot phan tu x vao vi tri k
    public static void insert(int[] a, int n, int x, int k) {
        for (int i = n; i > k; i--) {
            a[i] = a[i - 1];
        }
        a[k] = x;
        ++n;
    }

    //xoa phan tu o vi tri k
//    public static int[] delete(int []a,int n,int k){
//        for(int i=k;i<n-1;i++){
//            a[i] = a[i+1];
//        }
//        --n;
//        int [] b = new int[n];
//        for(int i=0;i<n;i++){
//            b[i] = a[i];
//        }
//        return b;
//    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int x = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //insert(a,n,x,k);


        //int []b = delete(a,n,k);
//        for(int j : b){
//            System.out.print(j + " ");
//        }
    }
}
