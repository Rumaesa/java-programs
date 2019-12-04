import java.io.*;
import java.util.*;
class cricket_team
{
  String team,player;
  double average;
  
  

  void read(String a,String b,double c)
 {
   team=a;
   player=b;
   average=c;
 }
 
 void arrange(cricket_team[] c)
{  
   int i,j;
  cricket_team temp=new cricket_team();
   for(i=0;i<5;i++)
   {
     for(j=i+1;j<5;j++)
    {
       if(c[i].team.equals(c[j].team))
     { 
       temp=c[i];
       c[i]=c[j];
       c[j]=temp;
     }
   }
 }
}

 void sort(cricket_team[] c)
{   
    int i,j;
    cricket_team temp=new cricket_team();
    
    for(i=0;i<5;i++)
   {
     for(j=i+1;j<5;j++)
      {
         if(c[i].average<c[j].average)
           {
              temp=c[i];
              c[i]=c[j];
              c[j]=temp;
           }
      }
   }
}


  void display(cricket_team[] c)
 { 
   int i;
   String c_name=new String();
   for(i=0;i<5;i++)
   {
    if(c_name.equals(c[i].team)!=true)
   {
     System.out.println(c[i].team+":");
     c_name=c[i].team;
   }
   System.out.println( c[i].player +"\t"+ c[i].average);
   }
 } 

  public static void main(String args[])
  {
    cricket_team[] c=new cricket_team[5];
    cricket_team a=new cricket_team();
    int i;
    for(i=0;i<5;i++)
    c[i]=new cricket_team();
    
    c[0].read("england","stokes",35.5);
    c[1].read("india","sachin",44.83);
    c[2].read("india","dhoni",50.9);
    c[3].read("australia","pointing",42.04);
    c[4].read("bangladesh","shakib",35.14);
    
    a.arrange(c);
    a.sort(c);
    a.display(c);
   }
}
