import javax.swing.*;
import java.applet.*;
import java.awt.*;
public class Login extends Applet
{
public void init()
{
JLabel l1,l2;
JTextField t1,t2;
JButton b1,b2;
setLayout(new GridLayout(3,3));
l1 =new JLabel("USER NAME");
t1 =new JTextField(20);
l2 =new JLabel("PASSWORD");
t2 =new JTextField(20);
b1 =new JButton("Submit");
b2 =new JButton("Cancel");
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
add(b2);
}
}
/*<APPLET CODE="Login" WIDTH=300 HEIGHT=300>
</APPLET>*/