package chuoi;

import java.util.Scanner;

public class Bai_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x = sc.nextLine();
        int cnt = 0;
        int len = x.length();
        int index = s.indexOf(x);//tra ve chi so dau tien cau sau x trong s
        while (index != -1) {
            cnt++;
            s = s.substring(0, index) + s.substring(index + len);
            index = s.indexOf(x);
        }
        System.out.println(cnt);
    }
}

