import java.util.*;
public class calculator {
  public static void main(String[] args) {
    System.out.println("Bharath C\t1BMM22CS068");
    Double num1, num2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1");
    num1 = sc.nextDouble();
    System.out.println("Enter number 2");
    num2 = sc.nextDouble();
    System.out.println("Sum = " + num1+num2 + "\n Difference = " + (num1 - num2) + "\n Product = " + num1*num2 +"\n Division = " + num1/num2);


  }  
}
