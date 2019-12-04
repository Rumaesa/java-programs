import java.awt.*; 
import java.applet.*; 
import java.awt.event.*;
public class AExample extends Applet 
//implements ActionListener 
{
Button okButton; 
TextField quantum,noofpeocesses,show; 
Label l1,l2,l3;

public void init()  
     { 
          setLayout(new FlowLayout()); 
          okButton = new Button("Action!"); 
          quantum = new TextField("    ",2);   
         // show = new TextField("    ",2); 
          noofpeocesses = new TextField("    ",2);
          l1 = new Label("***ROUND ROBIN ALGORITHM***"); 
          l2 = new Label("Enter Quantum here");
l3 = new Label("Enter number of processes");
add(l1);
           add(l2);
         add(quantum);
add(l3);
add(noofpeocesses);
add(okButton); 
==add(show);
 okButton.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
	{
      String str=ae.getActionCommand();

}
/*
<applet code="AExample" height=300 width=300>
</applet>
*/