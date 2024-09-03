package chuoi;

public class Bai7 {
    //dao nguoc chuoi
    public static void main(String[] args) {
        String name = "dinh van hoa";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(name.length() - 1 - i));
        }
        System.out.println();
        StringBuilder kq = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            kq.append(name.charAt(name.length() - 1 - i));
        }
        System.out.println(kq);
    }
}
