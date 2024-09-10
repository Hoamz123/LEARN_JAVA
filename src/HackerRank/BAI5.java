package HackerRank;


import java.util.Scanner;

public class BAI5 {
    public static String getSmallestAndLargest(String s, int k) {
        String res = s.substring(0, k);
        String smallest = res;
        String largest = res;
        for (int i = k; i < s.length(); i++) {
            res = res.substring(1) + s.charAt(i);
            if (res.compareTo(smallest) < 0) {
                smallest = res;
            }
        }
        res = s.substring(0, k);
        for (int i = k; i < s.length(); i++) {
            res = res.substring(1) + s.charAt(i);
            if (res.compareTo(largest) > 0) {
                largest = res;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
/*
input:
welcometojava
3
output:
ava
wel
 */