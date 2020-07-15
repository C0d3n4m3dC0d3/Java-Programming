import java.awt.*;
import java.applet.*;
/* <applet code="Sample" width=200 height= 100>
</applet>
*/
public class Sample extends Applet
{
String msg;
public void init()
{
setBackground(Color.cyan);
setForeground(Color.red);
msg = "Inside init()-";
}
public void start()
{
msg += "Inside start()-";
}
public void paint(Graphics g)
{
msg +="Inside paint()-";
g.drawString(msg,10,30);
showStatus("This is shown at status");
}
}