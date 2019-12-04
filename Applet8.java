import java.awt.*;
import java.applet.*;  
public class Applet8 extends Applet 
{
String name;
String age;
String sport;
String food;
String fruit;
String destination;
public void init()
{
name = getParameter("Name");
age = getParameter("Age");
food = getParameter("Food");
fruit = getParameter("Fruit");
destination = getParameter("Destination");
sport = getParameter("Sport");
}
public void paint(Graphics g)
{
g.drawString("Reading parameters passed to this applet -", 20, 20);
g.drawString("Name -" + name, 20, 40);
g.drawString("Age -" + age, 20, 60);
g.drawString("Favorite fruit -" + fruit, 20, 80);
g.drawString("Favorite food -" + food, 20, 100);
g.drawString("Favorite destination -" + name, 20, 120);
g.drawString("Favorite sport -" + sport, 20, 140);
}
}
/* 
<applet code="Applet8" width="400" height="200">
<param name="Name" value="Rumi">
<param name="Age" value="18">
<param name="Sport" value="Tennis">
<param name="Food" value="Pasta">
<param name="Fruit" value="Apple">
<param name="Destination" value="California">
</applet>
*/
