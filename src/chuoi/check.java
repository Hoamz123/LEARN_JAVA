package chuoi;
// ac ngay 10/8

import java.util.Scanner;

public class check {
    public static int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public static void rutGon(int tu, int mau) {
        if (tu > mau) {
            System.out.println(tu / mau + "," + (tu % mau) + "/" + mau);
        } else {
            System.out.println(tu + "/" + mau);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ps a = new ps(sc);
        ps b = new ps(sc);
        //tong

        {
            if (a.mau != 0 && b.mau != 0) {
                int tu = a.tu * b.mau + a.mau * b.tu;
                int mau = a.mau * b.mau;
                int T = tu / ucln(tu, mau);
                int M = mau / ucln(tu, mau);
                rutGon(T, M);
            }
        }
        //tru
        {
            if (a.mau != 0 && b.mau != 0) {
                int tu = a.tu * b.mau - a.mau * b.tu;
                int mau = a.mau * b.mau;
                int T = tu / ucln(tu, mau);
                int M = mau / ucln(tu, mau);
                rutGon(T, M);
            }
        }
        //nhan
        {
            if (a.mau != 0 && b.mau != 0) {
                int tu = a.tu * b.tu;
                int mau = a.mau * b.mau;
                int T = tu / ucln(tu, mau);
                int M = mau / ucln(tu, mau);
                rutGon(T, M);
            }
        }
        //chia
        {
            if (a.mau != 0 && b.mau != 0 && b.tu != 0) {
                int tu = a.tu * b.mau;
                int mau = a.mau * b.tu;
                int T = tu / ucln(tu, mau);
                int M = mau / ucln(tu, mau);
                rutGon(T, M);
            }
        }
    }

    public static class ps {
        private final int tu;
        private final int mau;

        //constructor
        public ps(Scanner sc) {
            this.tu = sc.nextInt();
            this.mau = sc.nextInt();
        }
    }

}
