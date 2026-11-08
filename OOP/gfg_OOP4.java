//geeksforgeeks OOP exercise (4/25) series Calculator ( basically sum of n odd numbers)
import java.util.Scanner;
class SeriesCalculator
{ int calculateSum( int n)
  { return n*n;}
  public static void main(String args[])
  { Scanner s= new Scanner(System.in);
    System.out.println("Please enter the no.of digits in the series");
	int n= s.nextInt();
	SeriesCalculator sc= new SeriesCalculator();
	int sum= sc.calculateSum(n);
	System.out.println("Sum :"+sum);
	}
	}
	