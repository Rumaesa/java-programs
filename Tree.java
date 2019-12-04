import java.io.*;
class Tree
{
int no;
double height, base, amount;
Tree(int num, double ht, double bs, double amt)
{
no=num;
height=ht;
base=bs;
amount=amt;
}

void update()
{
height=height+3;
base=base+2;
amount=amount+100;
}

void display()
{
System.out.println("TREE");
System.out.println("Tree Code "+no);
System.out.println("Height of a tree is "+height);
System.out.println("Base of a tree is "+base);
System.out.println("Amount spent so far on a tree is "+amount);
}
}

class MangoTree extends Tree
{
double yield;
MangoTree(int num, double ht, double bs, double amt, double yd)
{
super(num,ht,bs,amt);
yield=yd;
}


void update()
{
height=height+3;
base=base+2;
amount=amount+100;
yield=yield+2.3;
}

void display()
{
System.out.println("MANGO TREE");
System.out.println("Tree Code "+no);
System.out.println("Height of a tree is "+height);
System.out.println("Base of a tree is "+base);
System.out.println("Yield is "+yield);
System.out.println("Amount spent so far on a tree is "+amount);
}
}

class Garden
{
public static void main(String args[])
{
 Tree t= new Tree(1, 4.5, 2.3, 2000);
 t.update();
 t.display();
 MangoTree mt= new MangoTree(2, 5.8, 2.1, 3000, 4.55);
 mt.update();
 mt.display();
}
}
