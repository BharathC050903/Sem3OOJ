import java.util.*;

class StaticDemo {
  static int a = 42;
  static int b = 99;
  static void callme() {
    System.out.println("a = " + a);
  }
}
class StaticByName {
  public static void main(String args[]) {
    StaticDemo obj1 = new StaticDemo();
    obj1.a = 10;
    StaticDemo.callme();
    System.out.println("b = " + StaticDemo.b);
  } 
}