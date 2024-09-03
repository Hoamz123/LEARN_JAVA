package MangMotChieu;

import java.util.Scanner;

public class Bai_6 {
    //xoa phan tu dau tien cua x
    public static int[] deleteX(int[] a, int n, int k) {
        for (int i = k; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        --n;
        int[] b = new int[n];
        System.arraycopy(a, 0, b, 0, n);
        return b;
    }

    public static void main(String[] args) {
        //kiem tra xem x co xh trong mang hay khong
        // neu co thi xoa vi tri dau tien cua x
        // khong xh thi in ra Not Found
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            int[] b = deleteX(a, n, index);
            for (int i : b) {
                System.out.print(i + " ");
            }
        }
    }
}
