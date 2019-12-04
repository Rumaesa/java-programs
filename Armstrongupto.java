import java.io.*;
public class Armstrongupto
{
public static void main(String args[])
{
int sum,n,n1,d; 
for(int i=1;i<500;i++)
{ 
sum=0;
n1=n=i;
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
}