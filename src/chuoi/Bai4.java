package chuoi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
//        char ch = 'h';
//        System.out.println(String.valueOf(ch));ham de doi 1 cai gi do sang String
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++) {
            if (map.containsKey(line.charAt(i))) {
                int tx = map.get(line.charAt(i));
                ++tx;
                map.put(line.charAt(i), tx);
            } else {
                map.put(line.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
