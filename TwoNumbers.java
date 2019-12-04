import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class TwoNumbers extends Applet implements ActionListener
{
   TextField firstNum, secondNum, resultNum;
   public TwoNumbers()
   {                      
      setLayout(new GridLayout(3, 2, 10, 15));  
      setBackground(Color.cyan);
 
      firstNum = new TextField(15);
      secondNum = new TextField(15);
      resultNum = new TextField(15);
 
      secondNum.addActionListener(this);
 
      add(new Label("Enter First Number"));  add(firstNum);
      add(new Label("Enter Second Number")); add(secondNum);
      add(new Label("S U M"));               add(resultNum);
   }
   public void actionPerformed(ActionEvent e)
   {                        
      String str1 = firstNum.getText();
      double fn = Double.parseDouble(str1);
      double sn = Double.parseDouble(secondNum.getText());
 
      resultNum.setText("Sum is " + (fn+sn));
   }
}
/*
<applet code="TwoNumbers" height=300 width=300>
</applet>
*/