package MangMotChieu;

import java.util.Scanner;

public class Bai_8 {
    //in ra tong cua cac day con lien tiep co K phan tu (ung dung cua so truot)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //bat dau tinh tu cua so dau tien
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        System.out.print(sum + " ");

        for (int i = k; i < n; i++) {
            sum = sum + a[i] - a[i - k];
            System.out.print(sum + " ");
        }
    }
}
