import java.applet.Applet;  
import java.awt.Graphics;  

public class SimpleApplet extends Applet
{
public void paint(Graphics g)
{
g.drawString("My First Applet",40,40);
}
}


/* <applet code="SimpleApplet" width=200 height=100>
</applet>
*/