import java.util.Scanner;
class Calculator
{ 
  double calculateSum (double d1,double d2)
  { return d1+d2;}
  double calculateDifference (double d1,double d2)
  { return d1-d2;}
  public static void main(String args[])
  { Calculator c= new Calculator();
    double x= c.calculateSum(23,56);
	double y= c.calculateDifference(23,56);
	System.out.println("Sum :"+x);
	System.out.println("Difference :"+y);
	}
	}
  