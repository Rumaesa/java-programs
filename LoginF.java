import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class LoginF extends Applet
{
public void init()
{
setLayout(new GridLayout(3,3));
Label l1=new Label("User name");
Label l2=new Label("Password");
TextField t1=new TextField(25);
TextField t2=new TextField(25);
Button b1=new Button("SUBMIT");
Button b2=new Button("CANCEL");
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
add(b2);
}
}
/*<APPLET CODE="LoginF" WIDTH=300 HEIGHT=300>
</APPLET>*/