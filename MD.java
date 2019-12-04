import java.awt.*;
import javax.swing.*;
import java.applet.*;
public class MD extends Frame
{
public static void main(String args[])
{
MD m=new MD();
m.setVisible(true);
m.setSize(300,300);
MenuBar mbr=new MenuBar();
m.setMenuBar(mbr);
Menu filem=new Menu("file");
Menu editm=new Menu("edit");
Menu viewm=new Menu("view");
mbr.add(filem);
mbr.add(editm);
mbr.add(viewm);
MenuItem new1=new MenuItem("new");
MenuItem open1=new MenuItem("open");
filem.add(new1);
filem.add(open1);
}
}

