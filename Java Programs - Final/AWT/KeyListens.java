//JAVA PROGRAM TO IMPLEMENT LISTENERS

import java.awt.*;
import java.awt.event.*;

public class KeyListens implements KeyListener
{
  TextField tf;
  Label l, op, po;
  KeyListens(){
    Frame f = new Frame("Test Key Listener #1");
    l = new Label("     Type Something: ");
    op = new Label();
    po = new Label();
      l.setBounds(100, 75, 150, 50); //(x, y, length, height)
      op.setBounds(100, 200, 150, 30);
      po.setBounds(100, 240, 150, 30);
    tf = new TextField();
    tf.setBounds(100, 140, 200, 30);
    f.add(l); f.add(tf); f.add(op); f.add(po);
    tf.addKeyListener(this);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }
  public void keyTyped(KeyEvent e){}
  public void keyPressed(KeyEvent e){}
  public void keyReleased(KeyEvent e)
  {
    String ip = tf.getText();
    String words[] = ip.split("");
    op.setText("Word Count: " + words.length);
    po.setText("Characters: " + ip.length());
  }

  public static void main(String args[]){
    new KeyListens();
  }
}
