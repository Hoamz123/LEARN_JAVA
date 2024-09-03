package MangMotChieu;

import java.util.Scanner;

//mang danh dau (dem xem trong mang co bao nhieu phan tu khac nhau)
public class Bai_10 {
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
            d[x] = 1;
        }
        int cnt = 0;
        for (int i = 0; i < 1000001; i++) {
            if (d[i] == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
