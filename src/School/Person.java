package School;


import java.util.Scanner;

public class Person {
    private static int cnt;
    private final String name;
    private final int age;
    private final String ID;

    public Person(Scanner sc) {
        this.name = sc.nextLine();
        this.age = sc.nextInt();
        cnt++;
        ID = "TB" + String.format("%05d", cnt);//dang TB00001
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + ID;
    }
}
