import java.awt.*;
import java.applet.*;

public class SimpleApplet extends Applet
{
  String s;
  public void init(){
    s = "Hello World!";
  }
  public void paint(Graphics g){
    g.drawString(s, 100, 100);
  }
}
/*<applet code = "SimpleApplet.class" width = "400" height = "400">
</applet>*/
