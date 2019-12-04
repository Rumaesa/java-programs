import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
public class Larg extends Applet implements ActionListener
{
JButton b1;
Label l1,l2,l3;
TextField t1,t2,t3;
public void init()
{
setLayout(new GridLayout(4,3));
l1 =new Label("1st number");
t1 =new TextField(3);
l2 =new Label("2nd Number");
t2 =new TextField(3);
l3 =new Label("LARGEST ");
t3 =new TextField(3);
b1 =new JButton("Click for Largest");
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()== b1);
{
int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
if(n1>n2)
{
t3.setText(Integer.toString(n1));
}
else
{
t3.setText(Integer.toString(n2));
}
}
}
}
/*<APPLET CODE="Larg" WIDTH=300 HEIGHT=300>
</APPLET>*/ 