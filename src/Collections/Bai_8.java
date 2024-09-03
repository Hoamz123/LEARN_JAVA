package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class Bai_8 {
    public static void main(String[] args) {
        //kiem tra nhung phan tu thuoc mang 1 ma khong thuoc mang 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            ///neu x xuat hien trong  set
            set.remove(x);
        }
        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}
