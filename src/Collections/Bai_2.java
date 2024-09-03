package Collections;

import java.util.Scanner;

public class Bai_2 {
    //dem so luong uoc
    public static int slUoc(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt += 2;// mot uoc la i va mot uoc la n / i
            }
            if (i * i == n) {
                cnt--;
            }
        }
        return cnt;
    }

    //copy tat ca cac so phan nguyen to vao mang
    public static int[] pnt() {
        int[] p = new int[1000001];
        int res = 0;//so luong uoc cua thang dung truoc
        int k = 0;
        for (int i = 1; i < 10000001; i++) {
            int cnt = slUoc(i);
            if (cnt > res) {
                p[k++] = i;
                res = cnt;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int[] p = pnt();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x : p) {
            if (x >= t) {
                System.out.println(x);
                break;
            }
        }

    }
}
