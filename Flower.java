import java.applet.*;
import java.awt.*;

public class Flower extends Applet
{
public void init()
{
}
public void paint(Graphics g)
{
g.drawOval(150,200,50,50);
g.drawArc(200,200,45,345,423,150);
}
}
/*<applet code="Flower.class" width="500" height="400">
</applet>*/