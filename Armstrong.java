import java.io.*;
public class Armstrong
{
public static void main(String args[])
{
int sum=0,n1,n,d;
n=Integer.parseInt(args[0]);
n1=n; 
while(n>0)
{
 d=n%10;
sum=sum+d*d*d;
n=n/10;
}
if(sum==n1)
{
System.out.println("Armstrong:" +n1);
}
}
}
