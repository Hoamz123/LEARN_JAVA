package Collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Bai_4 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//        for(int i=0;i<n;i++){
//            set.add(sc.nextInt());
//        }
//        int q =sc.nextInt();//so luong truy van
//        while(q-->0){
//            int x = sc.nextInt();
//            if(set.contains(x)){//O(1)
//                System.out.println("Yes");
//            }
//            else{
//                System.out.println("No");
//            }
//        }
//
//    }
    //in ra cac phan tu khac nhau xuat hien trong mang ttheo thu tu xuat hien
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (!set.contains(x)) {
                //O(1)
                ///neu x chua xuat hien truoc do -> lan dau xuat hien
                System.out.print(x + " ");
                set.add(x);
            }
        }
    }
}
/*
5
1 2 1 3 4
2
1 6
 */