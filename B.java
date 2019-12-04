import java.awt.*; 
import java.applet.*; 
public class B extends Applet 
{ 
Label l1,l2; 
TextField t1,t2; 
Button b; 
public void init () 
{ 
setLayout(new GridLayout(3,2)); 
l1 = new Label ("username"); 
l2 = new Label("password"); 
t1 = new TextField (20); 
t2 = new TextField(20); 
b = new Button ("ok"); 
t2.setEchoChar('*'); 
add (l1); 
add (t1); 
add (l2); 
add (t2); 
add (b); 
} 
} 
/* <applet code = "B" width =300 height =300> 
</applet>*/ 
