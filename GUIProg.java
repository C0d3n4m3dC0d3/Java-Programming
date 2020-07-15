/*
  31. Create a GUI program in Java with the following components:
    a. A frame with flow layout.
    b. Add the following components on to the frame.
      i. Two TextFields ii. A button with the label display.
    c. Allow the useer to enter data into the TextFields
    d. When the button is clicked, paint the frame by displaying
    the data entered in the TextField.
    e. Allow the user to properly close the frame.
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class GUIProg extends Applet implements ActionListener
{
  TextField t1, t2;
  Button disp, exit;
  public void paint(Graphics g)
  {
    g.drawString(t1.getText(),150 , 150);
    g.drawString(t2.getText(), 150, 200);
  }

  public void init()
  {
    t1 = new TextField("        ");
    t2 = new TextField("        ");
    disp = new Button("Display");
    exit = new Button("Close");
    add(t1); add(t2);
    add(disp);
    add(exit);
    disp.addActionListener(this);
    exit.addActionListener(this);
    setLayout(new FlowLayout(FlowLayout.CENTER));
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
      if(e.getSource()==disp)
      {
          repaint();
      }
      else if(e.getSource()==exit)
      {
        System.exit(0);
      }
  }
}

/*
<applet code = "GUIProg.class" width = "400" height = "400">
</applet>
*/
