//geeksforgeeks OOP exercise (15/25) Program to find the largest and second largest out of three numbers
import java.util.Scanner;
class Numbers
{ int a;
  int b;
  int c;
  void accept()
  { Scanner s= new Scanner(System.in);
    System.out.println("Enter the three numbers");
	a= s.nextInt();
	b= s.nextInt();
	c= s.nextInt();
	}
	
	void largest() {
    int max = (a > b && a > c) ? a : (b > c ? b : c);
    System.out.println("Largest is: "+max);
}
	void secondLargest()
	{ if ((a>b&&a<c)||(a>c&&a<b))
	   { int max=a;
	     System.out.println("Second Largest is: "+max);}
		 else if ( (b>c&&b<a)||(b>a&&b<c))
		 { int max=b;
		   System.out.println("Second Largest is: "+max);}
		   else if((c>a&&c<b)||(c>b&&c<a))
		   { int max=c;
		   System.out.println("Second Largest is: "+max);}
		   else
		   {System.out.println("Please enter 3 distinct numbers");}
		   }
		   public static void main( String args[])
		   { Numbers n= new Numbers();
		   n.accept();
		   n.largest();
		   n.secondLargest();
		   }
		   }
	   
	  