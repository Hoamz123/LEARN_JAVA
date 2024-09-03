package TimKiem;

import java.util.Scanner;

public class BaiTap_3 {
    public static int getFirst(int[] a, int n, int x) {
        int l = 0, r = n - 1;
        int res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] > x) {
                res = m;
                r = m - 1;
            } else
                l = m + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        //cho mang tang dan tim chi so cua phan tu dau tien > x
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(getFirst(a, n, x));
        //und dung tinh duoc co bao nhieu so > x
        System.out.println(n - getFirst(a, n, x));
    }
}
