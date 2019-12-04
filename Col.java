import javax.swing.*;
import java.awt.*;
import  java.applet.*;
import  java.awt.event.*;
public class Col extends Applet implements ActionListener
{
JButton b1,b2,b3;
public void init()
{
JLabel l1;
l1 =new JLabel("select color");
b1 =new JButton("RED");
b2 =new JButton("YELLOW");
b3 =new JButton("BLUE");
add(l1);
add(b1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()== b1)
{
setBackground(Color.RED);
}
if(ae.getSource()== b2)
{
setBackground(Color.YELLOW);
}
if(ae.getSource()== b3)
{
setBackground(Color.BLUE);
}
}
}
/*<APPLET CODE="Col" WIDTH=300 HEIGHT=300>
</APPLET>*/ 