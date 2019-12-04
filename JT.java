import java.awt.Color;
import javax.swing.JApplet.*;
import javax.swing.JTable.*;
public class Jt extends JApplet
{
public void init()
{
String[] colHeads={"name","extends","id#"};
Object[][] data={
{"gail","7689","456"},
{"ken","4543","568"},
};
JTable table=new JTable (data,colHeads);
JScrollPane jsp=new JScrollPane(table);
table.setBackground(Color.GREEN);
add(jsp);
}
}
/*<APPLET CODE="JT.java" WIDTH=400 HEIGHT=400>
</APPLET>*/