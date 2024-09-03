package BAI2;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu;
    private String tenNhaXB;
    private int mount;//so luong phat hanh

    public TaiLieu(Scanner sc) {
        System.out.print("Nhap ma tai lieu: ");
        this.maTaiLieu = sc.nextLine();
        System.out.print("Nhap ten nha xb: ");
        this.tenNhaXB = sc.nextLine();
        System.out.print("Nhap so luong: ");
        this.mount = sc.nextInt();
        sc.nextLine();
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    public int getMount() {
        return mount;
    }

    public void setMount(int mount) {
        this.mount = mount;
    }

    @Override
    public String toString() {
        return "Ma tai lieu : " + this.maTaiLieu + "\nTen nha xuat ban : " + this.tenNhaXB + "\nSo luong : " + this.mount + "\n";
    }
}
