import java.awt.event.*;
import java.awt.*;
import java.lang.*;
public class ActList extends Frame implements ActionListener
{
Button rb,gb,bb;
public ActList()
{
FlowLayout ft = new FlowLayout();
setLayout(ft);
rb = new Button("RED");
gb = new Button("GREEN");
bb = new Button("BLUE");
add(rb);
add(gb);
add(bb);
rb.addActionListener(this);
gb.addActionListener(this);
bb.addActionListener(this);
setTitle("BUTTON IN ACTION");
setSize(300,300);
setVisible(true);
setVisible(false);
}
public void ActionPerformed(ActionEvent e)
{
String str = e.getActionCommand();
System.out.println("you clicked" +str+ "button");
if(str.equals("GREEN"));
{
setBackground(Color.green);
}
else if(str.equals("BLUE"));
{
setBackground(Color.blue);
}
else if(str.equals("RED"));
{
setBackground(Color.red);
}
}
public static void main(String args[])
{
new ActList();
}
}


