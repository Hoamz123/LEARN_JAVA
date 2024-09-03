package Collections;
/*cho day so a co n ptu
thao tac 1: them ptu
thao tac 2 : xoa neu ton tai
thao tac 3 : kiem tra phan tu co tt trong mang hay khong
*/

import java.util.HashMap;
import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //tao map de luu cac phan tu va tan xuat cua no
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (map.containsKey(x)) {//O(1)
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        int q = sc.nextInt();//q truy van
        while (q-- > 0) {
            int x, y;
            x = sc.nextInt();//thao tac x
            y = sc.nextInt();//phan tu de thao tac
            if (x == 1) {
                //thao tac 1
                map.put(y, map.get(y) + 1);
            } else if (x == 2) {
                //thao tac 2
                if (map.containsKey(y)) {
                    //neu y ton tai trong mang
                    int tx = map.get(y) - 1;
                    if (tx == 0) {
                        map.remove(y);
                    } else {
                        map.put(y, tx);
                    }
                }
            } else {
                //thao tac 3
                if (map.containsKey(y)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
/*
6
1 2 3 4 5 6
4
1 1
2 6
3 1
3 6

 */