package BAI2;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private final int soPhatHanh;
    private final int thangPhatHanh;

    public TapChi(Scanner sc) {
        super(sc);
        System.out.print("Nhap so phat hanh: ");
        this.soPhatHanh = sc.nextInt();
        System.out.print("Nhap thang phat hanh: ");
        this.thangPhatHanh = sc.nextInt();
        sc.nextLine();
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString() + "So phat hanh: " + this.soPhatHanh + "\nThang phat hanh: " + this.thangPhatHanh;
    }
}
