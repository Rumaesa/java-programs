import java.io.*;
      public class Fibbo
     {
      public static void main(String args[])
     {
      int ft=1,st=1,nt,n;
      System.out.println("Fibbo series" +ft+ " " +st);
      n=Integer.parseInt(args[0]);
      for(int i=2;i<n;i++)
     {
      nt=ft+st;
      System.out.print(nt);
      ft=st;
      st=nt;
      }
      }
      }
