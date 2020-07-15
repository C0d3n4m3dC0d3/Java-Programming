/*
  22. Write a Java program which creates a frame with two buttons 'Father' and
  'Mother'. When we click the 'Father' button, the name of the father, his age
  and designation must appear. When we click 'Mother', similar details of the
  mother should appear.
*/

import java.awt.*;
import java.awt.event.*;
public class FMButtons {
  public static void main(String args[]) {
    Frame f = new Frame("Click one!");
    Button dad = new Button("Father");
    Button mom = new Button("Mother");
    Label name = new Label();
    Label age = new Label();
    Label desig = new Label();
    dad.setBounds(50,100,80,30);
    mom.setBounds(250,100,80,30);
    name.setBounds(100, 150, 300,40);
    age.setBounds(100, 200, 300, 40);
    desig.setBounds(100, 250, 300, 40);
    f.add(dad); f.add(mom);
    f.add(name); f.add(age); f.add(desig);
    f.setSize(400,400);
    f.setLayout(null);f.setVisible(true);

    dad.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      name.setText("Name: Mahesh Kumar");
      age.setText("Age: 38");
      desig.setText("Designation: Finance Manager");
    }});
    mom.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
      name.setText("Name: Pournami Mahesh");
      age.setText("Age: 34");
      desig.setText("Designation: -- (Homemaker)");
    }});
  }
}
