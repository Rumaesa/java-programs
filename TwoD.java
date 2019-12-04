import java.util.*;
class TwoD
{
static int a[][]=new int[5][5];
static int b[][]=new int[5][5];
static int c[][]=new int[5][5];
static int r1,c1,r2,c2;
static void add()
{
	int i,j;
System.out.println("**YOU HAVE SELECTED OPTION 1.**");
System.out.println("ADDITION OF BOTH MATRIX IS:");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}
}

static void subtr()
{
	int i,j;
System.out.println("**YOU HAVE SELECTED OPTION 2.**");
System.out.println("SUBTRACTION OF BOTH MATRIX IS:");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
			c[i][j]=a[i][j]-b[i][j];
		}
	}
}

static void multi()
{
	int i,j,k;
System.out.println("**YOU HAVE SELECTED OPTION 3.**");
System.out.println("MULTIPLICATION OF BOTH MATRIX IS:");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c2;j++)
		{
			for(k=0;k<r2;k++)
			{
				c[i][j]=0;
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
		}
	}
}

static void display()
{
int i,j;
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
			System.out.print(c[i][j]+" ");
		}	
	System.out.println("\n");
	}
}
	
public static void main(String args[])
	{
	   int i,j,n;//r1,r2,c1,c2,i,j;
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter Row and Column of Matrix-1");
	   r1=sc.nextInt();
	   c1=sc.nextInt();
	   System.out.println("Enter Elements of Matrix-1");
	   for(i=0;i<r1;i++)
	  {
		for(j=0;j<c1;j++)
		{
			a[i][j]=sc.nextInt();
		}
	  }
	   
	   System.out.println("Enter Row and Column of Matrix-2");
	   r2=sc.nextInt();
	   c2=sc.nextInt();
	   System.out.println("Enter Elements of Matrix-2");
	   for(i=0;i<r2;i++)
	  {
		for(j=0;j<c2;j++)
		{
			b[i][j]=sc.nextInt();
		}
	  }
	   do
	   {
	   System.out.println("Enter Your Choice:");
	   System.out.println("1:ADDITION\n2:SUBTRACTION\n3:MULTIPLICATION\n *any no greater than 3 to EXIT*");
	   n=sc.nextInt();
	   switch(n)
	   {
		    case 1:add();
		          display();
				  break;
	        case 2:subtr();
		          display();
			      break;
			case 3:multi();
			       display();
				   break;
		    default:System.exit(0);
	   }
      }while(n!=5);
	}
}
