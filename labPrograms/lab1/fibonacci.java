import java.util.*;

public class fibonacci {
  public static void main(String[] args) {
    System.out.println("Bharath C\t1BMM22CS068");
    int input;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    input = sc.nextInt();
    if(input > 0){
      int a = 0;
      int b = 1;
      int c = 1;
      System.out.print("0 1");
      while (c <= input) {
        c = a + b;
        System.out.print(" " + c);
        a = b;
        b = c;
      }  
      System.out.println();
    }
  }
}

