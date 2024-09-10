package HackerRank;


import java.util.Scanner;

public class BAI3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a.length() + b.length());
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String rs = Character.toString(a.charAt(0)).toUpperCase() + a.substring(1).toLowerCase() + " " + Character.toString(b.charAt(0)).toUpperCase() + b.substring(1).toLowerCase();
        System.out.println(rs);
    }
}
