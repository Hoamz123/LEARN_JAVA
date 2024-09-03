package chuoi;

import java.util.Scanner;

public class Bai9 {
    public static void inSerTion_Sort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int x = a[i];
            int pos = i - 1;
            while (pos >= 0 && a[pos] > x) {
                a[pos + 1] = a[pos];
                pos--;
            }
            a[pos + 1] = x;
        }
    }

    public static void quickSort(int l, int r, int[] a) {
        int i = l, j = r;
        int x = a[(l + r) / 2];
        while (i <= j) {

            while (a[i] < x) {
                i++;
            }
            while (a[j] > x) {
                j--;
            }
            //neu thuc hien xong 3 vong while
            if (i <= j) {
                //hoan doi 2 vi tri
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                --j;
            }
        }
        if (i < r) quickSort(i, r, a);
        if (l < j) quickSort(l, j, a);
    }

    public static void BubleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    public static void SelectTionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int m = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[m]) {
                    m = j;
                }
            }
            int tmp = a[i];
            a[i] = a[m];
            a[m] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //inSerTion_Sort(a,n);
        //quickSort(0,n-1,a);
        //BubleSort(a, n);
        SelectTionSort(a, n);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
