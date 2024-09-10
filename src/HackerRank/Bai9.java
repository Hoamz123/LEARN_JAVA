package HackerRank;

import java.util.Scanner;

public class Bai9 {
    // tong hai so lon
    public static String sum(String a, String b) {
        // mac dinh sao cho sau a dai hon sau b
        if (a.length() < b.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }
        StringBuilder aa = new StringBuilder(a);
        //dao ngc de tinh tu cuoi
        aa.reverse();
        StringBuilder bb = new StringBuilder(b);
        bb.reverse();
        a = aa.toString();
        b = bb.toString();
        int n = a.length() - b.length();
        StringBuilder bBuilder = new StringBuilder(b);
        // cong them vao duoi sau b cac ki tu 0 de b dai = a;
        for (int i = 0; i < n; i++) {
            bBuilder.append("0");
        }
        b = bBuilder.toString();
        StringBuilder rs = new StringBuilder();
        int nho = 0;
        for (int i = 0; i < a.length(); i++) {
            int tmp = a.charAt(i) - '0' + b.charAt(i) - '0' + nho;
            rs.append(tmp % 10);
            nho = tmp / 10;
        }
        if (nho != 0) {
            rs.append(nho);
        }
        return rs.reverse().toString();// chuyen nguoc lai va ep ve String
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // tong hai so nguyen lon
        String a = sc.next();
        sc.nextLine();
        String b = sc.next();
        System.out.println(sum(a, b));
    }
}