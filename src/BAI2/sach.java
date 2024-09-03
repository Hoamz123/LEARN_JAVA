package BAI2;

import java.util.Scanner;

public class sach extends TaiLieu {
    private final String tenTacGia;
    private final int soTrang;
    private final String tenSach;

    public sach(Scanner sc) {
        super(sc);
        System.out.print("Nhap ten tac gia: ");
        this.tenTacGia = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        this.tenSach = sc.nextLine();
        System.out.print("Nhap so trang: ");
        this.soTrang = sc.nextInt();
        sc.nextLine();
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public String getTenSach() {
        return tenSach;
    }

    @Override
    public String toString() {
        return super.toString() + "Ten tac gia: " + tenTacGia + "\nTen sach: " + this.tenSach + "\nSo trang: " + soTrang;
    }
}
