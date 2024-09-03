package MangMotChieu;

import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        //mang cong don
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] F = new int[n];//tam cho mang cong don co n phan tu
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        F[0] = a[0];
        for (int i = 1; i < n; i++) {
            F[i] = F[i - 1] + a[i];
        }
        //in ra mang cong don
        for (int i : F) {
            System.out.print(i + " ");
        }
    }
}
