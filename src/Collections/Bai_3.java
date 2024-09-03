package Collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            set.add(sc.nextInt());
        }
        set.remove(5);
        for (int x : set) {
            System.out.print(x + " ");
        }

    }
}
