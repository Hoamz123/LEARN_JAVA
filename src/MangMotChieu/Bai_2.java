package MangMotChieu;

import java.util.Scanner;

public class Bai_2 {
    public static boolean checkDx(int[] a, int n) {
        int l = 0, r = n - 1;
        while (l <= r) {
            if (a[l] != a[r]) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }

    //kiem tra mang doi xung
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (checkDx(a, n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
