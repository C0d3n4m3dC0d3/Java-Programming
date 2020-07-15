//Simple Applet Program

import java.awt.*;
import java.applet.*;

public class Applet1 extends Applet
{
  public void paint(Graphics g)
  {
    g.drawString("My First Applet", 40, 40);
  }
}

/*
  <applet code = "Applet1.class" width = 200 height = 100>
  </applet>
*/
