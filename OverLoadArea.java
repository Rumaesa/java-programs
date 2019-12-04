 import java.util.*;
class OverLoadArea
{
void area(int a)
{
System.out.println("Area of Square:"+a*a);
}
void area(double a)
{
System.out.println("Area of circle:"+3.14*a*a);
}
void area(int x, int y, int z)
{
double s, a1;
s= (x+y+z)/2;
a1= Math.sqrt((s-x)*(s-y)*(s-z)); 
System.out.println("Area of triangle"+a1);
}
void area(double l, double b)
{
System.out.println("Area of rectangle:"+l*b);
}
}
class Area
{
public static void main(String args[])
{
OverLoadArea d= new OverLoadArea();
d.area(10);
d.area(8.5);
d.area(10,20,30);
d.area(6.5,8.5);
}
}
