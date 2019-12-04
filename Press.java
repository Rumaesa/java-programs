import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
public class  Press extends Applet implements ActionListener
{
TextField t1;
JButton b1,b2,b3;
public void init()
{
b1 =new JButton("YES");
b2 =new JButton("NO");
b3 =new JButton("EXIT");
t1 =new TextField(25);
add(b1);
add(b2);
add(b3);
add(t1);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()== b1)
{
String s=b1.getActionCommand();
t1.setText("you pressed " +s);
}
if(ae.getSource()== b2)
{
String s=b2.getActionCommand();
t1.setText("you pressed " +s);
}
if(ae.getSource()== b3)
{
String s=b3.getActionCommand();
t1.setText("you pressed " +s);
}
}
}
/*<APPLET CODE="Press" WIDTH=300 HEIGHT=300>
</APPLET>*/ 