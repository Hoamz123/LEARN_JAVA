package HackerRank;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = String.valueOf(sc.nextDouble());
        System.out.println("US: $" + s.substring(0, 2) + "," + s.substring(2));
        System.out.println("India: Rs." + s.substring(0, 2) + "," + s.substring(2));
        System.out.println("China: ￥" + s.substring(0, 2) + "," + s.substring(2));
        s = s.replaceAll("\\.", ",");
        System.out.println("France: " + s.substring(0, 2) + " " + s.substring(2) + "€");
    }
}
/*
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
 */