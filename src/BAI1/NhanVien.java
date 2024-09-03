package BAI1;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private final String position;

    public NhanVien(Scanner sc) {
        super(sc);
        System.out.print("Position: ");
        this.position = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "Position: " + position;
    }
}
