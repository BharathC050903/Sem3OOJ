/*Array of Objects */

import java.util.Scanner;

class student {
    String USN;
    String name;
    int marks[] = new int[6];
    float percentage = 0;

    void getData(int i) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter USN: ");
        USN = s.next();
        System.out.println("Enter Name:");
        name = s.next();
        System.out.println("Enter Student" + i + " Marks");
        for (int j = 0; j < 6; j++) {
            System.out.println("Enter Marks of Subject" + j + ":");
            marks[j] = s.nextInt();
            percentage += marks[j];
        }
    }

    void calculatePercentage(int i) {
        percentage = (percentage / 6); 
        System.out.println("Percentage of student" + i + "=" + percentage + "%");
    }
}

class studentMain {
    public static void main(String[] args) {
      System.out.println("Bharath C\t1BMM22CS068");
        System.out.println("Enter the number of Students");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        student s[] = new student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new student();
            s[i].getData(i);
        }
        for (int i = 0; i < n; i++) {
            s[i].calculatePercentage(i);
        }
    }
}

