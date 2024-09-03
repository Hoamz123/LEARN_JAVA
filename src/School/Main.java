package School;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Student(sc));
        }
        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
/*
4
dinh van hoa
19
3.42
CNTT
tran dieu linh
20
3.34
ATTT
nguyen thi linh
20
3.5
CNTT
Nguyen thi A
20
3.34
DTVT
 */