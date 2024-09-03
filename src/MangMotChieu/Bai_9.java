package MangMotChieu;

import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        //kiem tra mang chan hay le ( sl chan > sl le -> le)
        Scanner sc = new Scanner(System.in);
        int slChan = 0;
        int slLe = 0;
        int x;
        while (sc.hasNext()) {//trung nao con so trong bo dem
            x = sc.nextInt();
            if (x % 2 == 0) {
                slChan++;
            } else {
                slLe++;
            }
        }
        if (slChan > slLe) System.out.println("Chan");
        else if (slChan < slLe) System.out.println("Le");
        else System.out.println("Chan Le");
    }
}
