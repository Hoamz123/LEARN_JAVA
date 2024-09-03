package Collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

//hop cua hai mang
public class Bai_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
//hop hai mang
//        for(int i=0;i<n;i++){
//            set.add(sc.nextInt());
//        }
//        for(int i=0;i<m;i++){
//            set.add(sc.nextInt());
//        }
        //list chua set
//        ArrayList<Integer> list = new ArrayList<>(set);
//        list.sort(new Comparator<Integer>() {
//
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        for(int x  :list){
//            System.out.print(x+" ");
//        }
        //giao cua hai mang
        for (int i = 1; i <= n; i++) {
            set.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            set1.add(sc.nextInt());
        }
        set.retainAll(set1);
        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}
