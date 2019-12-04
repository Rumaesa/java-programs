import java.io.*;
import java.*util.*;
public class Fibbo
{
public static void main(String args[])
{
int ft=1,st=1,nt,n;
System.out.println("Fibbo series:"+ft+" "+st);
Scannersc=new sacnner(System.in);
int n=sc.nextInt();
for(int i=2;i<n;i++)
{
nt=ft+st;
System.out.println(nt);
ft=st;
st=nt;
}
}
}
