//TextArea Exmaple
import java.awt.*;

class TextArea1
{
  TextArea1()
  {
    Frame f = new Frame("TextArea Example");
    TextArea ta = new TextArea("This is a TextArea.\nIt is bigger than a TextField!");
    ta.setBounds(10,30,300,300);
    f.add(ta);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }
  public static void main(String args[])
  {
    new TextArea1();
  }
}
