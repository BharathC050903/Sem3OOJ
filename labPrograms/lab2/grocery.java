import java.util.*;

public class grocery {
  double qty_dal;
  double qty_pulse;
  double qty_sugar;

  grocery() {
    qty_dal = 1;
    qty_pulse = 1;
    qty_sugar = 1;
  }

  grocery(double a){
    qty_dal = a;
    qty_pulse = a;
    qty_sugar = a;
  }

  grocery(double a,double b, double c) {
    qty_dal = a;
    qty_pulse = b;
    qty_sugar = c;
  }
  grocery(grocery g) {
    qty_dal = g.qty_dal;
    qty_pulse = g.qty_pulse;
    qty_sugar = g.qty_sugar;
  }

  void total(){
    double sum = qty_dal * 10 + qty_pulse * 15 + qty_sugar * 20;
    System.out.println("Total = " + sum);
  }
}

class run{
  public static void main(String[] args) {
    System.out.println("Bharath C\t1BMM22CS068");
    Scanner sc = new Scanner(System.in);
    grocery g1 = new grocery();
    System.out.print("G1: ");
    g1.total();
    System.out.println("Enter Value for all grocery: ");
    double a = sc.nextDouble();
    grocery g2 = new grocery(a);
    System.out.print("G2: ");
    g2.total();
    grocery g3 = new grocery(10,20,30);
    System.out.print("G3: ");
    g3.total();
    grocery g4 = new grocery(g3);
    System.out.print("G4: ");
    g4.total();
    sc.close();
  }
}
