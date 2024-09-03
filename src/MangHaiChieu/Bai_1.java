package MangHaiChieu;

import java.util.Scanner;

public class Bai_1 {
    //in ra so lon nhat,nho nhat trong mang va cac vi tri xuat hien cua no
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int min = 1000000000;
        int max = -1000000000;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                min = Math.min(min, a[i][j]);
                max = Math.max(max, a[i][j]);
            }
        }
        System.out.println(min);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == min) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
        System.out.println(max);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == max) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
    }
}
