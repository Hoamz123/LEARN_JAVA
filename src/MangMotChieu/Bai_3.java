package MangMotChieu;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Bai_3 {
    //cho mang 1 c liet ke theo thu tu xh cac so co it nhat 1 so trai dau canh no
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        if (((long) a[0] * a[1]) < 0) {
            set.add(a[0]);
        }

        for (int i = 1; i < n - 1; i++) {
            if (((long) a[i] * a[i + 1]) < 0 || ((long) a[i] * a[i - 1]) < 0) {
                set.add(a[i]);
            }
        }

        if ((long) a[n - 1] * a[n - 2] < 0) {
            set.add(a[n - 1]);
        }
        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}
