import java.awt.*;
public class Button1
{
  public static void main(String args[])
  {
    Frame f = new Frame("Button1");
    Button b = new Button("Click Here!");
    b.setBounds(50,100,80,30); //setBounds(int x, int y, int width, int height)
    f.add(b);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }
}
