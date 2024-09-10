package HackerRank;

import java.util.Scanner;

public class Bai2 {
    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (check(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
