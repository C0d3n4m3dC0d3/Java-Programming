import java.awt.*;
import java.applet.*;

public class AppletParam extends Applet{
  String text, newText;
  public void init(){
    text = "Hello World!";
    newText = getParameter("ntxt");
    g.drawString(newText, 300, 300);
  }

  public void paint(Graphics g){
    g.drawString(text, 300, 100);
    text = getParameter("txt");
    g.drawString(text, 300, 500);
  }
}

/*
  <applet code = "AppletParam.class" width = "600" height = "600">
    <param name = "txt" value = "Hello Java!">
    <param name = "ntxt" value = "Hello Applet!">
  </applet>
*/
