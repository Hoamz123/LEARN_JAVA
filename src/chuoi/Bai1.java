package chuoi;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int temp = 0;
//        for(int i=0;i<s.length();i++){
//            if(Character.isDigit(s.charAt(i))){
//                temp = temp * 10 + (s.charAt(i)-'0');
//                if(temp > 96 && temp < 100){
//                    System.out.print((char) temp);
//                    temp = 0;
//                }if(temp >= 100 && temp <= 122){
//                    System.out.print((char)temp);
//                    temp = 0;
//                }
//            }
//
//        }
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            sb.append(ss[i].substring(0, 1).toUpperCase()).append(ss[i].substring(1)).append(" ");
        }
        String result = sb.toString().trim();
        System.out.println(result);
    }
}
