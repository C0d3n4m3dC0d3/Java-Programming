//Example of Painting in Applet:
import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class MouseDrag extends Applet implements MouseMotionListener{  
  
public void init(){  
addMouseMotionListener(this);  
setBackground(Color.green);  
}  
  
public void mouseDragged(MouseEvent me){  
Graphics g=getGraphics();  
g.setColor(Color.white);  
g.fillOval(me.getX(),me.getY(),5,5);  
}  
public void mouseMoved(MouseEvent me){}  
  
}  


/*<applet code="MouseDrag.class" width="300" height="300">  
</applet> */