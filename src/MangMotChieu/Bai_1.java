package MangMotChieu;

import java.util.Scanner;

public class Bai_1 {
    //sang snt tren khoang
    static boolean[] prime = new boolean[1000001];//khai bao toan cuc

    public static void sieve() {
        for (int i = 0; i < 1000001; i++) {
            prime[i] = true;
            prime[0] = prime[1] = false;
        }
        for (int i = 2; i <= 1000; i++) {
            if (prime[i]) {
                for (int j = i * i; j < 1000001; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    //sang tren doan
    public static void sang(int l, int r) {
        boolean[] pri = new boolean[r - l + 1];
        for (int i = 0; i < r - l + 1; i++) {
            pri[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(r); i++) {
            for (int j = Math.max(i * i, (l + i - 1) / i * i); j <= r; j += i) {
                pri[j - l] = false;
            }
        }
        for (int i = Math.max(2, l); i <= r; i++) {
            if (pri[i - l]) {
                System.out.print(i + " ");
            }
        }
    }

    public static int countSnt(int[] a, int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (prime[a[i]]) {
                cnt++;
            }
        }
        return cnt;
    }

    //check so Thuan nghich
    public static boolean checkTn(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //dem so thuan nghich
    public static int countTn(int[] a, int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (checkTn(a[i])) {
                cnt++;
            }
        }
        return cnt;
    }

    //check so chinh phuong
    public static boolean checkSCP(int n) {
        return (int) Math.sqrt(n) * (int) Math.sqrt(n) == n;
    }

    //dem so chinh phuong
    public static int countSCP(int[] a, int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (checkSCP(a[i])) {
                cnt++;
            }
        }
        return cnt;
    }

    //check tong cua mot xo co la snt hay khong
    public static boolean checkSum(int n) {
        String s = String.valueOf(n);//ep n ve String
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return prime[sum];
    }

    //dem so co tong la snt
    public static int countSumIsSnt(int[] a, int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (checkSum(a[i])) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        //goi ham sang snt
        sieve();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(countSnt(a, n));
        System.out.println(countTn(a, n));
        System.out.println(countSCP(a, n));
        System.out.print(countSumIsSnt(a, n));
    }
}
