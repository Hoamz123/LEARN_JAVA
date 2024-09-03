package BAI2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLTV qltv = new QLTV();//khoi tao quan ly thu vien
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1: Them sach,bao,tap chi vao danh sach");
            System.out.println("2: Hien thi thong tin danh sach");
            System.out.println("3: Tim kiem theo sach ,bao ,tap chi");
            System.out.println("4: Xoa tai lieu theo ma");
            System.out.println("0: Ket thuc chuong trinh");

            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("S: Them sach vao danh sach");
                System.out.println("B: Them bao vao danh sach");
                System.out.println("T: Them tap chi vao danh sach");
                char m = sc.next().charAt(0);
                sc.nextLine();
                if (m == 'S') {
                    //them sach vao list
                    TaiLieu sach = new sach(sc);
                    qltv.addTaiLieu(sach);
                }
                if (m == 'B') {
                    //them bao vao danh sach
                    TaiLieu bao = new Bao(sc);
                    qltv.addTaiLieu(bao);
                }
                if (m == 'T') {
                    //them tap chi vao danh sach
                    TaiLieu tapChi = new TapChi(sc);
                    qltv.addTaiLieu(tapChi);
                }
            }
            if (choice == 2) {
                //hien thi danh sach
                qltv.display();
            }
            if (choice == 3) {
                System.out.println("1: Tim kiem theo sach");
                System.out.println("2: Tim kiem theo bao");
                System.out.println("3: Tim kiem theo tap chi");
                //tim kiem theo sach
                int choose = sc.nextInt();
                sc.nextLine();
                if (choose == 1) {
                    qltv.searchBook();
                }
                if (choose == 2) {
                    qltv.searchByBao();
                }
                if (choose == 3) {
                    qltv.searchByNews();
                }
            }
            if (choice == 4) {
                System.out.print("Nhap ma tai lieu can xoa: ");
                //xoa theo ma tai lieu
                qltv.delByMaTL(sc.nextLine());
            }
            if (choice == 0) {
                System.out.println("The end");
                break;
            }
        }
    }
}
