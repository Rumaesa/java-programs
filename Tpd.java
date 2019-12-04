import java.awt.*;
import java.swing.*;
class Tpd extends JApplet
{
public void init()
{
JTappedPane jtp=new JTappedPane();
jtp.addTab("Cities",new CitiesPanel());
jtp.addTab("colors",new CitiesPanel());
}
}
/* 
<applet code=Tpd width=300 height=300>
</applet>
*/
