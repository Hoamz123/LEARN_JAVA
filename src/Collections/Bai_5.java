package Collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//in tan xuat cua cac phan tu trong mang tu nho den lon ,va in theo thu tu ban dau
public class Bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int x : a) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        for (int i : a) {
            if (map.get(i) != null) {
                System.out.println(i + " " + map.get(i));
            }
            map.remove(i);
        }
    }
}
/*
8
2 1 3 4 6 4 3 2*/