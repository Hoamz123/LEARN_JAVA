package BAI1;

import java.util.ArrayList;

public class QLCB {
    private final ArrayList<CanBo> QLCB;

    public QLCB() {
        QLCB = new ArrayList<>();
        //khoi tao mot arr list chua can bo(su dung da hinh
    }

    //method add
    public void addCanBo(CanBo cb) {
        QLCB.add(cb);
    }

    //method searchByName
    public void searchByName(String name) {
        for (CanBo cb : QLCB) {
            //duyet
            if (cb.getName().equals(name)) {
                System.out.println("Can bo ton tai trong danh sach");
                System.out.println(cb);
            } else {
                System.out.println("Can Bo khong ton tai trong danh sach");
            }
        }
    }

    //method in ra danh sach can bo
    public void display() {
        for (CanBo cb : QLCB) {
            System.out.println(cb);
        }
    }
}
