package BAI1;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private final int capBac;

    public CongNhan(Scanner sc) {
        super(sc);
        System.out.print("Level: ");
        this.capBac = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "Level: " + this.capBac;
    }
}
