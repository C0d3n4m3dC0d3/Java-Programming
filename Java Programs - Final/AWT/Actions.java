//ActionListener in AWT

import java.awt.*;
import java.awt.event.*;

public class Actions implements ActionListener{

  Label op;
  Button clk;

  Actions(){
    Frame f = new Frame("ActionListener - AWT");
    clk = new Button("Click Me!");
    op = new Label();
    op.setBounds(100, 230, 200, 30);
    clk.setBounds(130,175,100,30);
    clk.addActionListener(this);
    f.add(op); f.add(clk);
    f.setSize(350,400);
    f.setLayout(null);
    f.setVisible(true);
  }

  public static void main(String args[]){
    new Actions();
  }

  public void actionPerformed(ActionEvent e){
    op.setText("Ah! It clicks, doesn't it? ;)");
  }
}
