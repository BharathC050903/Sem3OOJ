import java.awt.*;
import java.awt.event.*;

public class eventHandling extends WindowAdapter implements ActionListener {
    
    Frame f; 
    TextField tf;
    
    eventHandling() { 
        f = new Frame();
        f.addWindowListener(this);

        tf = new TextField();
        tf.setBounds(60, 50, 170, 20); 
        

        Button b = new Button("click");
        b.setBounds(100, 120, 70, 30); 

        b.addActionListener(this); 
        
       
        f.add(b);
        f.add(tf);
        f.setSize(300, 300); 
        f.setLayout(null);
        f.setVisible(true); 
    }

    
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome"); 
    }


    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public static void main(String[] args) {
        new eventHandling(); 
    }
}
 
  


