// Java program for page replacement algorithms 
import java.util.ArrayList; 
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;	
public class LRU //extends Applet implements ActionListener
{ 
	static JLabel l1,l2,l3,l4,llru,lLRU; 
	static JButton b1,b2,b3,b4;
	static JTextField t1,t2,t3;
static int pgsize,pgval,pgnos,entcount=0;
//int x;
static int k=1,capacity; 
static String pgvals,resstring;
static int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
static int count=0; 
static int page_faults=0;	
static ArrayList<Integer> s=new ArrayList<>(capacity);
/*try
{*/
//static void pagerep() throws InterruptedException
static void pagerep()// throws InterruptedExcepXIECE181973ion
	{
		capacity=pgsize;
		
		// To represent set of current pages.We use 
		// an Arraylist 
		 
		 
		for(int i:arr)
		{ 
	
	//System.out.println();
resstring+="\n";
//Thread.sleep(1000);

llru.setText(llru.getText()+"<html><br><html>");
//System.out.print(i+" ");	
llru.setText(llru.getText()+k+" | "+i+" | ");
resstring+=i+" ";
//System.out.print(s.get(i)+" ");
	// Insert it into set if not present 
			// already which represents page fault 
			if(!s.contains(i)) 
			{ 
			
			// Check if the set can hold equal pages 
			if(s.size()==capacity) 
			{ 
				s.remove(0); 
				s.add(capacity-1,i); 

			} 
			else
				s.add(count,i); 
				// Increment page faults 
				page_faults++; 
				++count; 
//System.out.print(s);
//resstring+=s+"";		
//Thread.sleep(1000);
llru.setText(llru.getText()+s+" ");
			} 
			else
			{ 
//System.out.print(s);
			//System.out.print("Page Hit");
resstring+="Page Hit";
//Thread.sleep(1000);	
llru.setText(llru.getText()+"Page Hit")	;	
// Remove the indexes page 
				s.remove((Object)i); 
				// insert the current page 
				s.add(s.size(),i);
		 
			} 
		//for(int k:arr)
//System.out.println(resstring);
	k+=1;
	/*try{
	Thread.sleep(1000);
	}
	catch (InterruptedException ie)
	{}*/
	}
	
	}	
//}
	/*catch(InterruptedException e)
	{}*/
	// Driver method 
public static void main(String args[])  throws InterruptedException
{
	JFrame f= new JFrame("Label Example");  
    
    l1=new JLabel("Enter frame size :");  
	l1.setBounds(10,20, 100,30);  
	b1=new JButton("Submit");
	b1.setBounds(200,20,80,20);
	b2=new JButton("Submit");
	b2.setBounds(200,50,80,20);
	b3=new JButton("Submit");
	b3.setBounds(200,80,80,20);
    l2=new JLabel("Enter number of pages: ");  
    l2.setBounds(10,50, 150,30);  
	l3=new JLabel("Enter "+pgnos+" pages: ");  
    l3.setBounds(10,80, 150,30); 
	l3.setVisible(false);
	b3.setVisible(false);
	l4=new JLabel("");
	l4.setBounds(10,150,200,200);
    f.add(l1); f.add(l2);  
	f.add(b1);f.add(b2);f.add(b3);
	Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
	t1 = new JTextField(2);
	t1.setBounds(160,20,20,20);
	t2 = new JTextField(2);
	t2.setBounds(160,50,20,20);
	t3=new JTextField(2);
	t3.setBounds(160,80,20,20);
	t3.setVisible(false);
	f.add(t1);f.add(t2);f.add(t3);f.add(l4);
	f.add(l3);
	b4=new JButton("Calculate");//Calculate
	b4.setBounds(50,140,100,20);
	b4.setVisible(false);
	f.add(b4);
	llru=new JLabel("");
	llru.setBounds(50,60,1000,500);
	lLRU=new JLabel("Least Recently Used");
	//llru.setBorder(border);
	lLRU.setBorder(border);
	lLRU.setBounds(50,170,150,20);
	lLRU.setVisible(false);
	f.add(llru);
	f.add(lLRU);
   	f.setSize(500,500); 
	b1.addActionListener(new ActionListener()
	 {  
		public void actionPerformed(ActionEvent e)
		{ 
            String spgsize=t1.getText();
			pgsize=Integer.parseInt(spgsize);
			//l4.setText("Page size is "+pgsize);
			t1.setEnabled(false);
			b1.setEnabled(false);
			 }  
    }); 
	b2.addActionListener(new ActionListener()
	 {  
		public void actionPerformed(ActionEvent e)
		{ 
            pgnos=Integer.parseInt(t2.getText());
			//l4.setText("Page size is "+pgnos);
			t2.setEnabled(false);
			b2.setEnabled(false);
		}  
    });
	b3.addActionListener(new ActionListener()
	 {  
		public void actionPerformed(ActionEvent e)
		{ 
		
			//t3.setText("");
			l4.setText("<html>"+l4.getText()+"<br>"+(entcount+1)+"<html>  <html>"+t3.getText()+"<html>");
            if(entcount<pgnos-1)
			{
				pgvals=t3.getText();
				int x=Integer.parseInt(pgvals);
				arr[entcount]=x;
				System.out.println(entcount +" "+arr[entcount]);
				t3.setText("");
				entcount++;
				t3.requestFocus();
			}
			else
			{
				t3.setEnabled(false);
				b3.setEnabled(false);
				b4.setVisible(true);
			}
								
		}  
    });
	b4.addActionListener(new ActionListener()
	 {  
		public void actionPerformed(ActionEvent e)
		{ 
			l4.setVisible(false);        	    		
			llru.setText("");
			//try{
			pagerep();
			//}
			/*catch(InterruptedException ie)
			{
				
			}*/
			lLRU.setVisible(true);
			//llru.setText(resstring);
			 }  
    });
    f.setLayout(null);  
    f.setVisible(true);  
		//System.out.println(page_faults);
}
}
/*public void paint(Graphics g) { 
		 
	} 
} */
