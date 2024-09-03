package OnTapJava;

import java.util.*;

public class map {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int x : list) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        //
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        //cach lay 2 chu  so sau dau phay
        //System.out.printf("%.2f %.2f",2*a*3.14,3.14*a*
    }
}
