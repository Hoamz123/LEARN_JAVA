package TimKiem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiTap_1 {
    public static boolean binarySearch(ArrayList<Integer> list, int x) {
        int n = list.size();//so luong ptu trong list
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (list.get(m) == x) {
                return true;
            } else if (list.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //binarySearch
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //kt xem x co xuat hien trong mang hay khong
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        //sort
        Collections.sort(list);
        if (binarySearch(list, x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
