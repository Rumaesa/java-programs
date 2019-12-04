import java.io.*;
class Exhand {
   public static void main(String args[]) throws IOException  
   {
      String s;
       int a,b,c,d;
       
      InputStreamReader r =new InputStreamReader(System.in);
      BufferedReader input=new BufferedReader(r);
      try{
      System.out.println("Enter value of a");
      s=input.readLine();
      a=Integer.parseInt(s);
       System.out.println("Enter value of b");
      s=input.readLine();
      b=Integer.parseInt(s);
  System.out.println("Enter value of c");
      s=input.readLine();
      c=Integer.parseInt(s);
      d=(a+b)/c;
   System.out.println("d="+d);
      }
                 
      catch (ArithmeticException e) { 
        
         System.out.println("Denominator cannot be zero");
      }
      catch (NumberFormatException e) {
         
         System.out.println("Wrong Datatype entered");
      }
    
   }
}
