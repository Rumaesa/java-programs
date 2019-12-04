class StringManipulation
{
	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Object language");
		int i;
		System.out.println("Length of the string: "+str.length());

		System.out.println("Capacity of the string: "+str.capacity());

		for(i=0;i<str.length();i++)
		{
			int p = i+1;
			System.out.println("char at position: "+p+" is "+str.charAt(i));
		}

		String aString = new String(str.toString());
		int pos = aString.indexOf(" language");
		str.insert(pos," Oriented");
		System.out.println("Modified String: "+str);

		str.setCharAt(6,'-');
		System.out.println("String now : "+str); 

		str.append(" improves security.");
		System.out.println("Appended string: "+str);

		str.replace(25,30,"enhances");
		System.out.println("Replaced string: "+str);

		str.delete(25,28);
		System.out.println("Deleted string: "+str);

		System.out.println("Length of the string: "+str.length());
		System.out.println("Capacity of the string: "+str.capacity());
		str.deleteCharAt(28);
		System.out.println("Deleted chars the string: "+str);
		System.out.println("Reverse of the string: "+str.reverse());

	}
}