package abcd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Number {
    public static int slChan(int n) {
        int cnt = 0;
        while (n != 0) {
            int r = n % 10;
            if (r % 2 == 0) {
                cnt++;
            }
            n = n / 10;
        }
        return cnt;
    }

    public static int slLe(int n) {
        int cnt = 0;
        while (n != 0) {
            int r = n % 10;
            if (r % 2 != 0) {
                cnt++;
            }
            n = n / 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
            list1.add(list.get(i));
        }
        list.sort(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if (slChan(o1) != slChan(o2)) {
                    return slChan(o1) - slChan(o2);
                } else return o1 - o2;
            }
        });

        for (int x : list) {
            System.out.print(x + " ");
        }

        list1.sort(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return slLe(o1) - slLe(o2);
            }
        });
        System.out.println();
        for (int x : list1) {
            System.out.print(x + " ");
        }
    }
}