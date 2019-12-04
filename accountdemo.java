import java.lang.Math;
class account 
{
      String name,type;
   int a_no;
   double bal;
    account(int an,String n,double b)
  {
     name=n;
     a_no=an;
     bal=b;
  }
     void deposit(double amt)
   {
      bal=bal+amt;
      System.out.println(" upadated balance is"+bal);
   }
        void withdraw(double amt)
   {
       if((bal-amt)<=1000)
       System.out.println("No withrawl");
      else
       bal=bal-amt;
       System.out.println("remaining balance is"+bal);
   }
        void display()
    {
       System.out.println("Name:"+name);
       System.out.println("Balance"+bal);
    }
}
class saving extends account
{
     double noy,rate;
     saving(int no,String name,double bal, double noy,double r)
    {  
       super(no,name,bal);
       type="Savings";
       rate=r;
       this.noy=noy;
    }
   void interest()
   {
      double p1=1+rate/100;
       double p2=Math.pow(p1,noy);
        double bal1=bal*p2;
       double interest=bal1-bal;
       System.out.println("Amount of Interest"+interest);
   }
}
class current extends account
{
    int ch_no;
     current(int no,String name,double bal,int cno)
      {
         super(no,name,bal);
         ch_no=cno;
         type="current";
      }
        void withdraw(double amt)
     {
       bal=bal-amt;
        if(bal<=1000)
             {
               bal=bal-50;
              }
         else
          System.out.println("withdraw done succesfully");
     }
     void display()

     {
         super.display();
         System.out.println("cheque no:"+ch_no);
      }
  }
class accountdemo
{
    public static void main(String args[])
    {
       saving s=new saving(1234,"Rumi",10000,2.5,7);
        s.deposit(1000);
        s.interest();
        s.withdraw(2000);
        s.display();
         current c=new current(5678,"Rumi",10000,1001);
      c.deposit(500);
      c.withdraw(600);
      c.display();
      }
    }
