import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class FormGUI extends Frame implements ActionListener,ItemListener
{
	Frame f;
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1,b2,b3;
	Checkbox w,a,s,m;
	
	public void itemStateChanged(ItemEvent ie)
	{
		String str=new String(" ");
		if(w.getState()==true)
			str=str+"Windows";
		else if(a.getState()==true)
			str=str+"Android";
		else if(s.getState()==true)
			str=str+"Solaris";
		else if(m.getState()==true)
			str=str+"Mac";
		l3.setText(str);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			l3.setText("Data is Submitted Succesfully");
		}
		else if(ae.getSource()==b2)
		{
			t1.setText(" ");
			t2.setText(" ");
		}
		else if(ae.getSource()==b3)
		{
			l3.setText("Bye Bye");
			f.dispose();
		}
	}
	
	FormGUI()
	{
		f=new Frame();
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(800,1000);
		
		l1=new Label("ID");
		l1.setBounds(50,100,100,50);
		f.add(l1);
		
		l2=new Label("Name");
		l2.setBounds(50,150,100,50);
		f.add(l2);
		
		l3=new Label();
		l3.setBounds(150,450,300,50);
		f.add(l3);
		
		t1=new TextField();
		t1.setBounds(150,100,100,40);
		f.add(t1);
		
		t2=new TextField();
		t2.setBounds(150,150,100,40);
		f.add(t2);
		
		w=new Checkbox("Windows",null,true);
		w.setBounds(50,300,100,50);
		f.add(w);
		w.addItemListener(this);
		
		a=new Checkbox("Android",null,true);
		a.setBounds(150,300,100,50);
		f.add(a);
		a.addItemListener(this);
		
		s=new Checkbox("Solaris",null,true);
		s.setBounds(250,300,100,50);
		f.add(s);
		s.addItemListener(this);
		
		m=new Checkbox("Mac",null,true);
		m.setBounds(350,300,100,50);
		f.add(m);
		m.addItemListener(this);
		
		b1=new Button("Submit");
		b1.setBounds(200,500,75,50);
		f.add(b1);
		b1.addActionListener(this);
		
		b2=new Button("Reset");
		b2.setBounds(300,500,75,50);
		f.add(b2);
		b2.addActionListener(this);
		
		b3=new Button("Exit");
		b3.setBounds(400,500,75,50);
		f.add(b3);
		b3.addActionListener(this);
	}
	
	public static void main(String args[])
	{
		new FormGUI();
	}
}
