class staff
{
  int code;
  String name;
  staff(int code,String name)
  {
    this.code=code;
    this.name=name;
  }

   void display()
  {
    System.out.println("code:"+code+"\nname:"+name);
  }
}


class officer extends staff
{
  String grade;
  officer(int code,String name,String grade)
  {
     super(code,name);
     this.grade=grade;
  }

   void display()
   {
     super.display();
     System.out.println("grade:"+grade);
   }

}

class teacher extends staff
{
  String sub,pub;
  
  teacher(int code,String name,String sub,String pub)
 {
   super(code,name);
   this.sub=sub;
   this.pub=pub;
 }

   void display()
 {
   super.display();
   System.out.println("subject:"+sub);
   System.out.println("publication"+pub);
 }
  
}


class typist extends staff
{
   int speed;
  typist(int code,String name,int speed)
 {
    super(code,name);
    this.speed=speed;
 }

  void display()

 {
    super.display();
    System.out.println("speed:"+speed);
 }


}


class casual extends typist
{
    int daily_wages;
     casual(int code,String name,int speed,int daily_wages)
   {
      super(code,name,speed);
      this.daily_wages=daily_wages;
   }


    void display()
  {
     super.display();
      System.out.println("daily wages"+daily_wages);
  }

}


class regular extends typist
{
    int daily_wages;
    regular(int code,String name,int speed)
      {
          super(code,name,speed);
      }
    
   void display()

  {
       super.display();
 
  }


}





class staffinheritdemo
{
    public static void main(String args[])
    {

       teacher t=new teacher(1111,"rumi"," analysis of algorithms ","oxford publications");
          t.display();
       officer o=new officer(3111,"aliiii","A");
          o.display();
        casual c=new casual(3111,"laiba",311,1200);
          c.display();
         regular r=new regular(3000,"munno",123);
             r.display();
     }

}
