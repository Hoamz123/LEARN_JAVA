package BAI1;

import java.util.Scanner;

public class KySu extends CanBo {
    private final String Major;

    public KySu(Scanner sc) {
        super(sc);
        System.out.print("Major: ");
        this.Major = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "Major: " + Major;
    }
}
