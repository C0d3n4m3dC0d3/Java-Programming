import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AppletEvent extends Applet implements ActionListener{
  //Data Memebers
    TextField name, age;
    Label n, a, op;
    Button sub, clr;

  //Applet Functions to override
    public void init(){
      name = new TextField();
      age = new TextField();
      n = new Label("Enter name:  ");
      a = new Label("Enter age:   ");
      op = new Label();
      name.setBounds(200, 100, 100, 25);
      age.setBounds(200, 150, 100, 25);
      n.setBounds(100, 100, 100, 25);
      a.setBounds(100, 150, 100, 25);
      op.setBounds(100, 260 , 300, 40);
      add(name); add(age);
      add(n); add(a);
      add(op);

      sub = new Button("Display");
      clr = new Button("Clear");
      sub.setBounds(100, 200, 60, 30);
      clr.setBounds(250, 200, 50, 30);
      add(sub);add(clr);

      sub.addActionListener(this);
      clr.addActionListener(this);
      setLayout(null);
      setVisible(true);
    }

  //ActionListener functions to override
    public void actionPerformed(ActionEvent e){
      if(e.getSource() ==  sub)
      {
        String nm = name.getText();
        String ag = age.getText();
        op.setText("You are: " + ag + " year old " + nm);
      }
      else if(e.getSource() == clr)
      {
        name.setText("");
        age.setText("");
        op.setText("");
      }
    }
}

/*
  <applet code = "AppletEvent.class" width = "500" height = "500">
  </applet>
*/
