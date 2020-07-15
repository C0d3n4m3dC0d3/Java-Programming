//Mouse Listener
import java.awt.*;
import java.awt.event.*;

public class Mousey extends Frame implements MouseListener{
  Label l;
  Mousey(){
   addMouseListener(this);
   l = new Label();
   l.setBounds(120, 180, 200, 50);
   add(l);
   setLayout(null);
   setSize(400,400);
   setVisible(true);
  }
  public static void main(String args[]){
    new Mousey();
  }

  //MouseListener methods overridden: [5 methods]
  public void mouseClicked(MouseEvent e){
    l.setText("You clicked lil' mousey!");
  }
  public void mouseEntered(MouseEvent e){
    l.setText("Whoa! Here comes mousey!!");
  }
  public void mouseExited(MouseEvent e){
    l.setText("s e d , mousey left, :(");
  }
  public void mousePressed(MouseEvent e){
    l.setText("hohoho! Santa's 'ere!");
  }
  public void mouseReleased(MouseEvent e){
    l.setText("ah! f r e e d o m!");
  }
}
