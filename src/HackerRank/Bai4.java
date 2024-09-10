package HackerRank;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ax2 + bx + c = 0
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == 0) {
            //bx + c = 0;
            if (b == 0 && c == 0) {
                System.out.println("WOW");
            } else if (c != 0 && b == 0) {
                System.out.println("NO");
            } else {
                System.out.printf("%.2f", (float) -c / b);
            }
        } else {
            // ax2 + bx + c = 0
            float d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("NO");
            } else if (d == 0) {
                System.out.printf("%.2f", (float) -b / (2 * a));
            } else {
                System.out.printf("%.2f ", (float) (-b - Math.sqrt(d)) / (2 * a));
                System.out.printf("%.2f", (float) (-b + Math.sqrt(d)) / (2 * a));
            }
        }
    }
}