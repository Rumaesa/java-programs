import java.applet.*;
import java.awt.*;
public class House extends Applet
{
public void init()
{
}
public void paint(Graphics g)
{
g.setColor(Color.black);
 g.drawRect(150,100,320,117);
g.setColor(Color.red);
 g.fillRect(150,100,320,117);
int a[]={55,150,205};
  int b[]={217,100,217};
 g.setColor(Color.red);
 g.fillPolygon(a,b,3); 

 g.setColor(Color.black);
 g.drawPolygon(a,b,3); 
g.setColor(Color.black);
 g.drawRect(55,217,415,217);
g.setColor(Color.pink);
g.fillRect(55,217,415,217);
g.setColor(Color.blue);
g.fillRect(220,280,100,57);
 g.fillRect(350,280,100,57);
g.setColor(Color.blue);
 g.drawRect(90,290,85,145);
g.fillRect(90,290,85,145);
g.setColor(Color.black);
g.drawLine(120,290,120,435);
g.drawLine(245,280,245,335);
g.drawLine(270,280,270,335);
g.drawLine(295,280,295,335);
g.drawLine(375,280,375,335);
g.drawLine(400,280,400,335);
g.drawLine(425,280,425,335);
 g.setColor(Color.yellow);
  g.fillOval(120,155,40,40);
g.setColor(Color.black);
  g.drawOval(120,155,40,40);  
 g.setColor(Color.black);
  g.fillOval(125,355,10,30); 
g.setColor(Color.black);
g.drawLine(205,217,205,435);
g.drawLine(55,217,55,435);
g.drawLine(55,217,470,217);
g.drawLine(150,100,470,100);
g.drawLine(150,100,55,217);

 }
}
/*<applet code="House.class" width="500" height="400">
</applet>
*/ 