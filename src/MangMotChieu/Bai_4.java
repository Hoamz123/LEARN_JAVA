package MangMotChieu;

import java.util.Scanner;

public class Bai_4 {
    /*list ke cac phan tu trong mang thoa man no > ca phan tu trc va ptu sau nos ,khong tinh a[0
 va a[n-1];*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < n - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
