import java.util.Scanner;
class Fibonacci
 {
   public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

  int i=1, a=0, b=1, c, n;
  n=sc.nextInt();
  System.out.println(a);
  System.out.println(b);
  for(i=0;i<n;i++)
   {
     c=a+b;
     a=b;
     b=c;
     System.out.println(+c);
   }
  }
 }