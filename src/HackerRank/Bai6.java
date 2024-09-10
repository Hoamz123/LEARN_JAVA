package HackerRank;

import java.util.Scanner;


public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            ss.append(s.charAt(s.length() - 1 - i));
        }
        System.out.println(ss.toString().replaceFirst("^0+", ""));// xoa nhieu so 0 o dau
    }
}
