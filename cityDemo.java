 import java.util.*;
class cityDemo
{
	public static void main(String args[])
	{
	Vector v= new Vector();
	v.addElement("Mumbai");
	v.addElement("Delhi");
	v.addElement("Goa");
	Scanner s=new Scanner(System.in);
	String city;
	int x;
	do
	{
		System.out.println("1:Add City\n2:Remove City\n3:Display\n4:Exit");
		System.out.println("Enter Your Choice: ");
		x=Integer.parseInt(s.nextLine());
		switch(x)
		{
			case 1:System.out.println("Enter City: ");
				   city=s.nextLine();
				   if(v.contains(city))
				   {
					   System.out.println("Already Present");
					   break;
				   }
				   else
				   {
					   v.addElement(city);
					   break;
				   }
			case 2:System.out.println("Enter City: ");
				   city=s.nextLine();
				   if(v.contains(city))
				   {
					   v.removeElement(city);
					   break;
				   }
				   else
				   {
						System.out.println("Element Not Present");
						break;
				   }
			case 3:int len= v.size();
				   for(int i=0;i<len;i++)
					   System.out.println(v.elementAt(i)+"\t");
				   break;
			case 4:break;
			default:System.out.println("Invalid Input");
					break;
		}
	}while(x!=4);
   }
}     
