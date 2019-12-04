import java.util.*;	
      public class GCD1
{
public static void main(String args[])
{
int m1,m,n1,n,lcm,gcd;
m=Integer.parseInt(args[0]);
n=Integer.parseInt(args[1]);
m1=m;
n1=n; 
while(m!=n)
{
if(m>n)
m=m-n;
else
n=n-m;
}
gcd=m;
lcm=m1*n1/m;
System.out.println("GCD is:" +m);
System.out.println("LCM is:" +lcm);
}
}
