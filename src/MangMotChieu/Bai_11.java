package MangMotChieu;

import java.util.Scanner;

//in ra tan xuat xuat hien
public class Bai_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] d = new int[1000001];
        for (int i = 0; i < 1000001; i++) {
            d[i] = 0;
        }
        for (int x : a) {
            d[x]++;
        }
        for (int i = 0; i < 1000001; i++) {
            if (d[i] != 0) {
                System.out.println(i + " " + d[i]);
            }
        }
    }
}
