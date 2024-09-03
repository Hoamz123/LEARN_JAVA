package MangHaiChieu;

import java.util.Scanner;

public class Bai_2 {
    public static boolean stn(int n) {
        int x = 0;
        int y = n;
        while (n != 0) {
            x = x * 10 + n % 10;
            n /= 10;
        }
        return x == y;
    }

    //in ra nhung so thuan ngich thuoc tam giac duoi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (stn(a[i][j])) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
