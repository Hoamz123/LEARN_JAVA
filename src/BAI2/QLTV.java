package BAI2;

import java.util.ArrayList;

public class QLTV {
    private final ArrayList<TaiLieu> list;

    public QLTV() {
        list = new ArrayList<>();
    }

    //them vao danh sach
    public void addTaiLieu(TaiLieu t) {
        list.add(t);
    }

    //xoa tai lieu theo ma tai lieu
    public void delByMaTL(String maTl) {
        for (TaiLieu t : list) {
            if (t.getMaTaiLieu().equals(maTl)) {
                list.remove(t);
                System.out.println("Xoa tai lieu thanh cong");
                return;
            }
        }
        System.out.println("Xoa tai lieu khong thanh cong");
    }

    //tim kiem theo sach
    public void searchBook() {
        //in ra tat ca thong tin cua tat ca sach
        System.out.println("---------------------------");
        this.list.stream().filter(doc -> doc instanceof sach).forEach(System.out::println);
        System.out.println("---------------------------");
    }

    //tim kiem theo bao
    public void searchByBao() {
        System.out.println("---------------------------");
        this.list.stream().filter(doc -> doc instanceof Bao).forEach(System.out::println);
        System.out.println("---------------------------");
    }

    //tim kiem theo tap chi
    public void searchByNews() {
        System.out.println("--------------------------");
        this.list.stream().filter(doc -> doc instanceof TapChi).forEach(System.out::println);
        System.out.println("--------------------------");
    }

    //hien thi thong in ve tai lieu
    public void display() {
        for (TaiLieu t : list) {
            System.out.println(t);
            System.out.println("----------------------------------");
        }
    }
}
