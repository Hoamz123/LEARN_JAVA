package TimKiem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap_2 {
    public static int getFirstIndex(List<Integer> list, int x) {
        int l = 0, r = list.size() - 1;
        int res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (list.get(m) == x) {
                res = m;
                r = m - 1;
            } else if (list.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //tim vi tri dau tien cua phan tu x trong mang tang dan
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(getFirstIndex(list, x));
    }
}
