import java.awt.*;
import javax.swing.*;
import java.applet.*;
public class FileE extends Applet
{
public void init()
{
MenuBar mbr=new MenuBar();
SetMenuBar(mbr);
Menu fileM=new Menu("File");
Menu editM=new Menu("Edit");
Menu viewM=new Menu("View");
mbr.add(fileM);
mbr.add(editM);
mbr.add(viewM);
MenuItem newM=new MenuItem("New");
MenuItem openM=new MenuItem("Open");
fileM.add(newM);
fileM.add(openM);
}
}
/*<APPLET CODE="FileE" WIDTH=300 HEIGHT=300>
</APPLET>*/