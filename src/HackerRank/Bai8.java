package HackerRank;

import java.util.Scanner;

public class Bai8 {
    public static String doiCoSo2(long n) {
        StringBuilder s = new StringBuilder();
        while (n != 0) {
            s.append(n % 2);
            n /= 2;
        }
        return s.reverse().toString();//StringBuilder co the dao ngc chuoi
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(doiCoSo2(n));
        }
    }
}
