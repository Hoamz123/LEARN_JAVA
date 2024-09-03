package TimKiem;

public class BaiTap_4 {
    public static void transRight(int[] a, int n) {
        int x = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = x;
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void transLeft(int[] a, int n) {
        int x = a[0];
        for (int i = 0; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[n - 1] = x;
        /*for(int i : a){
            System.out.print(i + " ");
        }*/
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
        //transRight(a,10);
        transLeft(a, 10);
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        transLeft(a, 10);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
