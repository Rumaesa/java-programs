import java.io.*;
class Complex
{
int real, imaginary;
Complex()
{
real=0;
imaginary=0;
}
Complex(int r, int im)
{
real=r;
imaginary =im;
}
 
Complex add(Complex c2)
{
Complex c3= new Complex();
c3.real= real+ c2.real;
c3.imaginary= imaginary+ c2.imaginary;
return c3;
}

void display()
{
System.out.println("Addition= "+real+" + "+imaginary+"i");
}
}

class Complexx
{
public static void main(String args[])
{
Complex c1= new Complex(1,2);
Complex c2= new Complex(3,4);
Complex c3= new Complex();
c3=c1.add(c2);
c3.display();
}
}
