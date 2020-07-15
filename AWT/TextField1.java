import java.awt.*;
class TextField1
{
  public static void main(String args[])
  {
    Frame f = new Frame("It's my first TextField!");
    TextField t1, t2;
    t1 = new TextField("Welcome to My Home!");
      t1.setBounds(50, 200, 200, 30);
    t2 = new TextField("AWT Tutorial");
      t2.setBounds(50, 150, 200, 30);
    f.add(t1);
    f.add(t2);
    f.setSize(500, 500);
    f.setLayout(null);
    f.setVisible(true);
  }
}
