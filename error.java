import java.util.Scanner;


class error
{
public static void main(String args[])
{
int a;
int b;
Scanner sc=new Scanner(System.in);
try
{

System.out.println("Enter first number: ");
a=Integer.parseInt(sc.next());
System.out.println("Enter second number: ");
b=Integer.parseInt(sc.next());


int z=a/b;
System.out.println("Division is: "+z);
}

catch(ArithmeticException e)
{
System.out.println("Division by zero error ");
}

catch(NumberFormatException e)
{
System.out.println("Invalid numbers: ");
}

}
}

