import java.awt.*;

class AWT1{
  public static void main(String args[]){
    Frame f = new Frame("AWT Test 1");
    Label l1 = new Label("This is my first label program!");
    l1.setBounds(30, 200, 80, 20);
    f.add(l1);
    f.setSize(400,400);
    f.setVisible(true);
    f.setLayout(null);
  }
}
