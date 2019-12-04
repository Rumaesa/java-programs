import java.applet.*;
import java.awt.*;

public class Jocker1 extends Applet
{
public void init()
{
}
public void paint(Graphics g)
{
 int a[]={245,365,480};
  int b[]={317,100,317};
 g.setColor(Color.red);
 g.fillPolygon(a,b,3);    //Traingle (cap of the jocker)
 g.setColor(Color.pink);
  g.fillOval(238,238,250,250); //circle (jockers face) 
  g.setColor(Color.black);
  g.fillOval(275,325,30,30); //1st eyes of jocker
 g.fillOval(420,325,30,30);  //2nd eyes of jocker
  g.setColor(Color.yellow);
 g.fillArc(315,395,100,50,180,180); //mouth of jocker
 g.setColor(Color.blue);
g.fillOval(348,88,30,30);
  int x[]={355,365,375};
  int y[]={375,355,375};
 g.drawPolygon(x,y,3);
 

 }
}
/*<applet code="Jocker1.class" width="500" height="400">
</applet>
*/ 