package BAI1;

import java.util.Scanner;

public class CanBo {
    private final String name;
    private final int age;
    private final String gender;
    private final String address;

    public CanBo(Scanner sc) {
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("Age: ");
        this.age = sc.nextInt();
        sc.nextLine();//chong troi lenh
        System.out.print("Gender: ");
        this.gender = sc.nextLine();
        System.out.print("Address: ");
        this.address = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Name: " + name + "  Age: " + age + "  Gender: " + gender + "  Address: " + address + " ";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }
}
