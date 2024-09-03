package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        //khai bao mot cai list
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //them vao list n phan tu
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
//        for(int x : list){
//            System.out.println(x);
//            // or dung get(i)
//        }
        System.out.println(list.contains(5));//O(n) kiem tra xem 5  co xh trong list hay khong (true) or (false)
        list.set(2, 100);//vi du ham set thay doi gia tri tai chi so 2 -> 100
        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}
