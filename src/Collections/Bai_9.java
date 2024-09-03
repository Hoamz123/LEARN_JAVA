package Collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

//tim nhung phan tu thuoc mang 1 hoac mang 2 nhung khong duoc xh o ca hai mang
public class Bai_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();//luu hop hai mang
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();//luu giao hai mang
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (set.contains(x)) {
                //neu x nam trong mang a
                set2.add(x);//luu vao giao
            } else {
                //x chua xuat hien trong mang a
                set.add(x);//luu vao hop
            }
        }
        set.removeAll(set2);//xet  trong tap (hop) xoa toan bo nhung ptu thuoc tap giao hai mang
        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}
