//geeksforgeeks OOP exercise (16/25) Program to find an element in array using linear search
import java.util.Scanner;
class LinearSearch
{void linearSearch()
	{Scanner s= new Scanner(System.in);
  System.out.println("Please enter the number of elements in an array");
  int n= s.nextInt();
  int arr[]= new int[n];
  System.out.println("Please enter array elements");
  for(int i=0;i<n;i++)
  {arr[i]=s.nextInt();}
System.out.println("Enter the number you want to search");
    int number =s.nextInt();
	int flag=0;
	int i;
	for(i=0;i<n;i++)
	{if(arr[i]==number)
		{flag=1;
		break;}
  }
	
	if(flag==1)
	{System.out.println("The number "+number+"is found in position "+i);}
else
{System.out.println("Number not found");}
	}
	  
  
  
	  public static void main(String args[])
	  { LinearSearch l= new LinearSearch();
	   l.linearSearch();}
	   }
	   