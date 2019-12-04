import java.io.*;
class ComplexNo
{
int real, imaginary;
ComplexNo()
{
real=0;
imaginary=0;
}
ComplexNo(int r, int im)
{
real=r;
imaginary =im;
}
 
ComplexNo add(ComplexNo c2)
{
ComplexNo c3= new ComplexNo();
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
ComplexNo c1= new ComplexNo(1,2);
ComplexNo c2= new ComplexNo(3,4);
ComplexNo c3= new ComplexNo();
c3=c1.add(c2);
c3.display();
}
}
