package chuoi;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bai8 {
    public static void main(String[] args) {
        String s = "dinh van hoa";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int tx = map.get(s.charAt(i));
                tx++;
                map.put(s.charAt(i), tx);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        //duyet map
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
