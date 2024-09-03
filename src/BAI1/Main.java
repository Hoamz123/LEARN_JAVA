package BAI1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        //tao danh sach chua thong tin
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("1: Them can bo vao danh sach");
            System.out.println("2: Tim kiem can bo");
            System.out.println("3: In danh sach can bo");
            System.out.println("4: Ket thuc chuong trinh");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                //them can bo vao list
                //cho nguoi dung chon nhap tt cua cn,ks ,hay nhan vien
                System.out.println("C : Them cong nhan vao danh sach");
                System.out.println("K : Them ky su vao danh sach");
                System.out.println("N : Them nhan vien vao danh sach");
                char h = sc.next().charAt(0);//
                sc.nextLine();
                if (h == 'C') {
                    //them cong nhan vao
                    CanBo congNhan = new CongNhan(sc);//upcasting
                    qlcb.addCanBo(congNhan);
                }
                if (h == 'K') {
                    //thong tin cua ky su
                    CanBo kySu = new KySu(sc);
                    qlcb.addCanBo(kySu);
                }
                if (h == 'N') {
                    //thong tin mot nhan vien
                    CanBo nhanVien = new NhanVien(sc);
                    qlcb.addCanBo(nhanVien);
                }
            } else if (choice == 2) {
                //tim kiem can bo theo ten
                String name = sc.nextLine();//nhap ten can bo muon tim
                qlcb.searchByName(name);
            } else if (choice == 3) {
                //in ra danh sach
                qlcb.display();
            } else {
                System.out.println("Ket thuc chuong trinh");
                break;
            }
        }
    }
}
