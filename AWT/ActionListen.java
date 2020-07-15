//Errors - Fixed!! It's runnin'
import java.awt.*;
import java.awt.event.*;

public class ActionListen
{
  public static void main(String args[])
  {
    Frame f = new Frame("Action Listener");
    TextField tf = new TextField();
    tf.setBounds(50,50,150,20);
    Button b = new Button("Click Here!");
    b.setBounds(50,100,60,30);
    //1st Step - Implement the listener into our class
    //2nd Step - Register the component with the Listener
    b.addActionListener(new ActionListener()
    //3rd step - Override the Method of Listener.
    //Has only one method - actionPerformed()
    {public void actionPerformed(ActionEvent e)
      {
        tf.setText("Welcome to Java Tutorial!");
      }});
    f.add(b);
    f.add(tf);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }
}
