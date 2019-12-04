import java.awt.*;
import javax.swing.*;
import java.applet.*;
public class MenuDemo extends Frame
{
public static void main(String args[])
{
MenuDemo md =new MenuDemo();
md.setVisible(true);
MenuBar mbr = new MenuBar();
md.setMenuBar(mbr);
md.setSize(300,300);
Menu filem=new Menu("File");
Menu editm=new Menu("edit");
Menu viewm=new Menu("view");
mbr.add(filem);
mbr.add(editm);
mbr.add(viewm);
MenuItem new1=new MenuItem("new");
MenuItem open1=new MenuItem("open");
MenuItem copy1=new MenuItem("copy");
MenuItem paste1=new MenuItem("paste");
filem.add(new1);
filem.add(open1);
editm.add(copy1);
editm.add(paste1);
}
}


