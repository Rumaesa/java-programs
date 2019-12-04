import java.util.*;
class Linear
{
public static void main(String args[])
{
int a[]=new int[5];
int x,n,i,flag=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number of Elements");
n=sc.nextInt();
System.out.println("Enter the Elements");
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}

System.out.println("Enter Element to Search");
x=sc.nextInt();

for(i=0;i<n;i++)
{
	if(x==a[i])
	{	System.out.println("Element Found at Position "+i);
        flag=1;
	}
}

if(flag==0)
{
	System.out.println("Element Not Found");
}
}
}
