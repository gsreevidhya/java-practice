//geeksforgeeks OOP exercise (5/25) Largest number in array program
import java.util.Scanner;
class Rectangle
{ double length;
  double breadth;;
  Rectangle ()
  { length=1;
    breadth=1;}
	Rectangle( double length, double breadth) //constructor overloading
	{ this.length=length;
	  this.breadth= breadth;}
	  Scanner s= new Scanner(System.in);
	  void setLength()
	  {	System.out.println("Enter the length of the Rectangle");
	    length= s.nextDouble();}
		void setBreadth()
		{ System.out.println("Enter the breadth of the Rectangle");
		    breadth= s.nextDouble();}
		  double calculateArea()
		  {return length*breadth;}
		  public static void main( String args[])
		  { Rectangle r1= new Rectangle();
		   System.out.println("The default area of Rectangle is :"+r1.calculateArea());
		     Rectangle r2= new Rectangle(23,10);                                                                      
System.out.println("The custom area of Rectangle is :"+r2.calculateArea());
 r1.setLength();
 r1.setBreadth();
 System.out.println("The updated area of Rectangle is :"+r1.calculateArea());
 }
 }
 
			  
		  
		   
	  