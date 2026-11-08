//geeksforgeeks OOP exercise (5/25) Largest number in array program
import java.util.Scanner;
class Biggest
{ int display(int arr[])
   { int max= arr[0];
     for(int i:arr)
       {  if(max<i)
           max=i;}
       return max;}		   
 
     public static void main(String args[])
  { Scanner s= new Scanner(System.in);
    System.out.println("Please enter the number of elements"); 
    int n=s.nextInt();
	int arr[]= new int[n];
	System.out.println("Please enter the elements");
	for( int i=0;i<n;i++)
	{ arr[i]=s.nextInt();}
	Biggest b= new Biggest();
     int max= b.display(arr);
	 System.out.println("Maximum number is :"+max);
	}
}
	
    