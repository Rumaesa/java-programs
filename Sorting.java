import java.io.*;


class Sorting


{
	
public static void main(String args[])throws IOException

	{
		
int[] array = new int[100];
		
int max = 9;
		
int low , temp;
		
int a =  0,i,j,k,ch;


	try
{
		
	BufferedReader keyb = new BufferedReader (new InputStreamReader(System.in));

System.out.print("Enter max number of Elements you want:");
			
max = Integer.parseInt(keyb.readLine());
			
/*for ( i = 0 ; i < max ; i++)
			
{
				
System.out.print("Enter number:");
		
		array[i] = Integer.parseInt(keyb.readLine());
	
		}*/


                                         
 if(max>0)
		
	{

do
{

BufferedReader keyb1 = new BufferedReader (new InputStreamReader(System.in));

System.out.println("\n\n\nEnter your choice:\n1:Bubble sort\n2:Selection sort\n3:Insertion sort\n4:Exit\n\n");                              
    //choice of sorting
    ch = Integer.parseInt(keyb1.readLine());
 
      switch(ch)
      
            {
                
             

      case 1: 		//bubble sort


for ( i = 0 ; i < max ; i++)
	
		{
				
System.out.print("Enter number:");

				array[i] = Integer.parseInt(keyb.readLine());

			}






                 for(i=0;i<max;i++)
      
               {
	
     for(j=0;j<max-1;j++)
	
      {
	   
    if(array[j]>array[j+1])
	
	{
		
 temp=array[j];
		
 array[j]=array[j+1];
	
	 array[j+1]=temp;
		
}
	    
   }
	   
  }
	

 System.out.println("*********** BUBBLE SORT **********");

 System.out.println("\t\n\n");                                        
                //printing
    for(i=0;i<max;i++)
     
{

      System.out.print(array[i]+"  ");

     }





            break;


               case 2:	
			//selection sort


for ( i = 0 ; i < max ; i++)

			{
				
System.out.print("Enter number:");

array[i] = Integer.parseInt(keyb.readLine());

			}





    
for(i=0;i<max-1;i++)
   
          {

              for(j=i+1;j<max;j++)

               {
  
               if(array[i]>array[j])

                 {

                  temp=array[i];
 
                 array[i]=array[j];
   
               array[j]=temp;
              
   
                 }

              }

            }


System.out.println("******* SELECTION SORT ***********");

 System.out.println("\t\n\n");        
                                                //printing
    for(i=0;i<max;i++)
     
{
 
     System.out.print(array[i]+"  ");

     }

					


                                                     break;

       case 3:					//insertion sort

for ( i = 0 ; i < max ; i++)

			{
				
System.out.print("Enter number:");
				
array[i] = Integer.parseInt(keyb.readLine());
	
		}








    for(i=1;i<max;i++)

 	     {

 	      for(j=0;j<i;j++)

	       {
 
  	      
  	        if(array[j]>array[i])
  
     	         {

      	          temp=array[i];  

    		    
    		   for(k=i;k>j;k--)

      		    {
  
    		     array[k]=array[k-1];

     		    }
     	 
         array[j]=temp;
    
   		}
    	      
}
	    
}


 System.out.println("******** INSERTION SORT ***********"); 
                           
  System.out.println("\t\n\n");
                                                        //printing
    for(i=0;i<max;i++)

     {

      System.out.print(array[i]+"  ");

     }


  
          break;
 

                              default:

					
if(ch<4)
        
                   System.out.println("Wrong Choice");
 		
break;

                             
                                 }





 	}while(ch<4);



                          }



		
   
                                }
	
catch (IOException e)
		
{
			
System.out.println("System Error");

		}
	
catch (NumberFormatException er)
		
{
			
System.out.println("Wrong Input");

		}

	


System.out.print("\n\n\n\n-------------------------------------------------------------------------------\n\n");

System.out.print("\n\t\t\tImplemented by \n\t\t\t              RUMAESA \n\t\t\t              AARTI \n\t\t\t              REVATI \n\n");

System.out.print("\n-------------------------------------------------------------------------------\n\n");




    }


}



