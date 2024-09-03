package OnTapJava;

import java.util.Scanner;

//class Main {
//        public static boolean snt(int n){
//        if(n<2) return false;
//        for(int i=2;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
////    public static boolean cp(int n){
////        return (int)Math.sqrt(n) * (int)Math.sqrt(n) == n;//nho ep ve int
////    }
////    public static void sieve(int l,int r){
////        boolean []p = new boolean[r-l+1];
////        for(int i=0;i<r-l+1;i++){
////            p[i] = true;
////        }
////        for(int i=2;i<=Math.sqrt(r);i++){
////            for(int j = Math.max(i*i,(l+i-1)/i*i);j<=r;j+=i){
////                p[j-l] = false;
////            }
////        }
////        int cnt = 0;
////        for(int i = Math.max(2,l);i<=r;i++){
////            if(p[i-l]) {
////                cnt = 1;
////                System.out.print(i + " ");
////            }
////        }
////        if(cnt==0){
////            System.out.println("-");
////        }
////    }
//    public static void main(String[] args) {
//
//    }
//}
public class Main {
    public static int ucln(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ps hoa = new ps(sc);//khoi tao constructor cho phep nhap du lieu trong constructor
        ps moi = new ps();

        System.out.println(moi.getTu() + "/" + moi.getMau());
    }

    static class ps {
        private int tu;
        private int mau;

        public ps(Scanner sc) {
            this.tu = sc.nextInt();
            this.mau = sc.nextInt();
        }

        public ps() {
        }

        public int getMau() {
            return mau;
        }

        public int getTu() {
            return tu;
        }

        public ps rutGon() {
            ps s = new ps();
            s.tu = this.tu / ucln(tu, mau);
            s.mau = this.mau / ucln(tu, mau);
            return s;
        }
    }
}