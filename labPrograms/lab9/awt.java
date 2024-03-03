import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt extends WindowAdapter {
  Frame f;
  awt(){
    f = new Frame();
    f.addWindowListener(this);
    Label l = new Label("Employee ID:");
    Button b = new Button("Submit");
    TextField t = new TextField();

    l.setBounds(20,80,110,30);
    t.setBounds(20,100,80,30);
    b.setBounds(100,100,80,30);

    f.add(b);
    f.add(l);
    f.add(t);

    f.setSize(400,300);


    f.setTitle("Employee info");
    f.setLayout(null);
    f.setVisible(true);
  }

  public void windowClosing(WindowEvent e){
    System.exit(0);
  }
 
  public static void main(String[] args) {
    @SuppressWarnings("unused")
    awt obj = new awt();
  }
}
