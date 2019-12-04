
import java.awt.*;
     import java.applet.*;
     import java.awt.event.*;
 /* <applet code="roundrobin2" width=400 height=400>
    </applet> */
   
public class roundrobin2 extends Applet implements ActionListener
{
	String s1,s2,s3;
             TextField t3,t4,t5,t6,t7;
			 Button calc;
			 Panel p1,p2,p3,p4;
	public void init()
             {
                  s3=" ";
                  calc=new Button("Calculate RR");
                  
	           p1=new Panel();
                 p1.setLayout(new GridLayout(2,2));

                 p1.add(new Label("Enter Number of Process "));
                 p1.add(new TextField(5));

                 				 
				 add(p1);
               
			   p4=new Panel(); p4.setLayout(new GridLayout(6,2));
        p4.add(new Label("Enter Burst Time for process 1:"));
       t3=new TextField(3);    p4.add(t3);

       p4.add(new Label("Enter Burst Time for process 2:"));
       t4=new TextField(3); p4.add(t4);

       p4.add(new Label("Enter Burst Time for process 3:"));
       t5=new TextField(3); p4.add(t5);     

      
	   add(p4);
	    add(calc);
	  calc.addActionListener(this);
			 }
			 
			 
			 public void actionPerformed(ActionEvent e)
      {
         s3=e.getActionCommand();
         if(s3.equals("Total"))
           t6.setText(s1);
         if(s3.equals("Average"))
           t7.setText(s2);
           repaint();
      }
			 
			

}
		
	/*
	
	public static void main(String args[])throws IOException
{
DataInputStream in=new DataInputStream(System.in);
int i,j,k,q,sum=0;
System.out.println("Enter number of process:");
int n=Integer.parseInt(in.readLine());
int bt[]=new int[n];
int wt[]=new int[n];
int tat[]=new int[n];
int a[]=new int[n];
System.out.println("Enter brust Time:");
for(i=0;i<n;i++)
{
System.out.println("Enter brust Time for "+(i+1));
bt[i]=Integer.parseInt(in.readLine());
}
System.out.println("Enter Time quantum:");
q=Integer.parseInt(in.readLine());
for(i=0;i<n;i++)
a[i]=bt[i];
for(i=0;i<n;i++)
wt[i]=0;
do
{
for(i=0;i<n;i++)
{
if(bt[i]>q)
{
bt[i]-=q;
for(j=0;j<n;j++)
{
if((j!=i)&&(bt[j]!=0))
wt[j]+=q;
}
}
else
{
for(j=0;j<n;j++)
{
if((j!=i)&&(bt[j]!=0))
wt[j]+=bt[i];
}
bt[i]=0;
}
}
sum=0;
for(k=0;k<n;k++)
sum=sum+bt[k];
}
while(sum!=0);
for(i=0;i<n;i++)
tat[i]=wt[i]+a[i];
System.out.println("process\t\tBT\tWT\tTAT");
for(i=0;i<n;i++)
{
System.out.println("process"+(i+1)+"\t"+a[i]+"\t"+wt[i]+"\t"+tat[i]);
}
float avg_wt=0;
float avg_tat=0;
for(j=0;j<n;j++)
{
avg_wt+=wt[j];
}
for(j=0;j<n;j++)
{
avg_tat+=tat[j];
}
System.out.println("average waiting time "+(avg_wt/n)+"\n Average turn around time"+(avg_tat/n));
}
}
*/