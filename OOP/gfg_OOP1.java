// geeksforgeeks OOP exercise (1/25) 
import java.util.Scanner;
class MessagePrinter
{ void printMessage(String name)
  {System.out.println("Hello "+name);}
  
  public static void main( String args[])
  { Scanner s= new Scanner(System.in);
     String name= s.nextLine();// nextLine() takes a string with spaces also
     MessagePrinter m= new MessagePrinter();
     m.printMessage( name);
	
	}
}
