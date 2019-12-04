import java.applet.*;
import java.awt.*;
public class Joker   extends Applet
{
 Font f;
 Color c;
 public void init()
 {
  f=new Font("Arial",Font.ITALIC,20);
  c=new Color(32,45,134);
  setFont(f);
 }
 public void paint(Graphics g)
 {
  int a[]={245,365,480};
  int b[]={317,100,317};
  g.setColor(Color.red);
  g.fillPolygon(a,b,3);
  //g.drawLine(245,317,365,100);
  //g.drawLine(480,317,365,100);
  g.setColor(Color.pink);
  g.fillOval(238,238,250,250);
  g.setColor(Color.black);
  g.fillOval(275,325,30,30);
  g.fillOval(420,325,30,30);
  g.setColor(Color.yellow);
  g.fillArc(315,395,100,50,180,180);
  int x[]={355,365,375};
  int y[]={375,355,375};
  g.drawPolygon(x,y,3);
  g.drawRect(20,20,100,50);
  //g.drawRoundRect(100,20,100,50,20,20);
  g.setColor(c);
  g.drawString("rohit shrama",4,20);
 }
}
/*<applet code="Joker.class"width="500" height="500">
</applet>
*/ 