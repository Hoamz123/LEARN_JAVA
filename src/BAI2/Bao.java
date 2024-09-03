package BAI2;

import java.util.Scanner;

public class Bao extends TaiLieu {
    private final String ngayPhatHanh;

    public Bao(Scanner sc) {
        super(sc);
        System.out.print("Nhap ngay phat hanh: ");
        this.ngayPhatHanh = sc.nextLine();
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString() + "Ngay phat hanh: " + this.ngayPhatHanh;
    }
}
