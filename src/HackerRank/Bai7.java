package HackerRank;

import java.util.Scanner;

public class Bai7 {
    // in ra chu cai in hoa trong doan a->b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        while (true) {
            System.out.print(Character.toString(a).toUpperCase() + " ");
            if (a != b) {
                a += 1;
            } else {
                break;
            }
        }
    }
}
