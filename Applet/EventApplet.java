//Example of EventHandling in applet:
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class EventApplet extends Applet implements ActionListener
{
  public void paint(Graphics g)
  {
    setBackground(Color.red);
  }
  Button b;t1.setBounds(50, 200, 100, 40);
  t2.setBounds(250, 200, 100, 40);
  disp.setBounds(150, 250, 80, 40);
  TextField tf;
  public void init(){
    tf=new TextField();
    tf.setBounds(30,40,150,20);

    b=new Button("Click");
    b.setBounds(80,150,60,50);

    add(b);add(tf);
    b.addActionListener(this);

    setLayout(null);
    }

    public void actionPerformed(ActionEvent e){
      tf.setText("Welcome");
    }
  }

/*<applet code="EventApplet.class" width="300" height="300">
</applet>*/
