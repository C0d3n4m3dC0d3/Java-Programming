//CheckBoxGroup Example
import java.awt.*;

class CheckBoxGroup1
{
  CheckBoxGroup1()
  {
    Frame f = new Frame("CheckBox Example");
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox c1 = new Checkbox("C++", cbg, false);
    Checkbox c2 = new Checkbox("Java", cbg, true);
    c1.setBounds(50,50,50,50);
    c2.setBounds(50,50,50,50);
    f.add(c1);
    f.add(c2);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }

  public static void main(String args[])
  {
    new CheckBoxGroup1();
  }
}
