package School;

import java.util.Scanner;

public class Student extends Person implements Comparable<Student> {
    private final float GPA;
    private final String Major;

    public Student(Scanner sc) {
        super(sc);
        this.GPA = sc.nextFloat();
        this.Major = sc.next();
        sc.nextLine();
    }

    public float getGPA() {
        return GPA;
    }

    public String getMajor() {
        return Major;
    }

    @Override
    public String toString() {
        return super.toString() + " " + Major + " " + GPA;
    }


    @Override
    public int compareTo(Student o) {
        //sort theo gpa tang dan
        if (this.GPA != o.GPA) {
            if (this.GPA > o.GPA) {
                return -1;
            } else return 1;
        } else {
            return this.getName().compareTo(o.getName());
        }
    }
}

