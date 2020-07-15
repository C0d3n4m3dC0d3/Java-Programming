//CheckBox Example
import java.awt.*;

class CheckBox1
{
  CheckBox1()
  {
    Frame f = new Frame("CheckBox Example");
    Checkbox c1 = new Checkbox("C++");
    c1.setBounds(100,100,50,50);
    Checkbox c2 = new Checkbox("Java", true);
    c2.setBounds(100,100,50,50);
    f.add(c1);
    f.add(c2);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }

  public static void main(String args[])
  {
    new CheckBox1();
  }
}
