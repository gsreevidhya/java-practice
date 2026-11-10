//geeksforgeeks OOP exercise (10/25) Program to display the last digit of a number in words
import java.util.Scanner;
class LastDigit
{ String display()
  { Scanner s= new Scanner(System.in);
    System.out.println("Please enter the number");
	int n= s.nextInt();
	int lastDigit= n%10;
	switch(lastDigit)
	{ case 1: return "One"; 
	
	  case 2: return "Two";
	         
	  case 3: return "Three";
	          
	  case 4: return "Four";
             
      case 5: return "Five";
              
      case 6: return "Six";
              
      case 7: return "Seven";
             
      case 8: return "Eight";
             
      case 9: return "Nine";
             
      case 0: return "Zero";
             
      default: return "Invalid";
}
}
public static void main( String args[])
{ LastDigit ld= new LastDigit();
  System.out.println(ld.display());
}
}  