import java.io.*;

public class StringMethods 
{
 public static void main(String args []) 
  {
  	String targetString= "Java is fun to learn";
    String s1 ="JAVA";
    String s2 ="Java"; 
    String s3 = "hello java";

    System.out.println("After concat"+targetString.concat("-Enjoy-"));
    System.out.println("Checking Equals ignore case"+s2.equalsIgnoreCase(s1));
    System.out.println("Checking Equals with case"+s2.equals(s1));
    System.out.println("Checking length"+targetString.length());
    System.out.println("Replace Function"+targetString.replace("fun","easy"));
    System.out.println("Sub string of target string"+targetString.substring(8));
    System.out.println("Sub string of target string"+targetString.substring(8,12));
    System.out.println("Converting to lower case"+targetString.toLowerCase());
    System.out.println("Converting to uppercase"+targetString.toUpperCase());
    System.out.println("Trimming"+s3.trim());
    System.out.println("Searching s1 in targetString"+targetString.contains(s1));
    System.out.println("Searching s2 in targetString"+targetString.contains(s2));

    char[] chararray = s2.toCharArray();
    System.out.println("Size of CharArray"+chararray.length);
  }
}

