//Mouse Motion Listener
import java.awt.*;
import java.awt.event.*;

public class MouseyMoves extends Frame implements MouseMotionListener, ActionListener{
  Button b;
  MouseyMoves(){
    b = new Button("c l e a r");
    b.setBounds(400,480, 70, 30);
    b.addActionListener(this);

    addMouseMotionListener(this);
    add(b);
    setSize(500, 550);
    setLayout(null);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
    repaint();
  }
  public void mouseMoved(MouseEvent e){ }
  public void mouseDragged(MouseEvent e){
      Graphics g = getGraphics();
      g.setColor(Color.BLACK);
      g.fillOval(e.getX(), e.getY(), 30, 20);
  }
  public static void main(String[] args) {
      new MouseyMoves();
  }
}
