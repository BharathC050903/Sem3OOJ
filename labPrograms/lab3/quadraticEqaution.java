/* Objects */
import java.util.Scanner;

class quadratic {
    int a, b, c;
    double r1, r2, d;

    void getData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of a, b, c");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
    }

    void compute() {
        while (a == 0) {
            System.out.println("Not a quadratic equation");
            System.out.println("Enter a non-zero value of a");
            Scanner s = new Scanner(System.in);
            a = s.nextInt();
        }

        d = (b * b) - (4 * a * c);

        if (d == 0) {
            r1 = -b / (2 * (double) a);
            System.out.println("Roots are real and equal");
            System.out.println("Roots are Root1=Root2=" + r1);
        } else if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2 * (double) a);
            r2 = (-b - Math.sqrt(d)) / (2 * (double) a);
            System.out.println("Roots are real and distinct");
            System.out.println("Roots are Root1=" + r1 + " and Root2=" + r2);
        } else {
            r1 = -b / (2 * (double) a);
            r2 = Math.sqrt(Math.abs(d)) / (2 * (double) a);
            System.out.println("Roots are imaginary and Root1=" + r1 + "+i" + r2 + " and Root2=" + r1 + "-i" + r2);
        }
    }
}

class quadraticMain {
    public static void main(String[] args) {
        System.out.println("Bharath C\t1BMM22CS068");
        quadratic q = new quadratic();
        q.getData();
        q.compute();
    }
}
