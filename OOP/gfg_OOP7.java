//geeksforgeeks OOP exercise (7/25) Program to override toString() and implementing encapsulation 
import java.util.Scanner;
class Person
{ private String firstName;
  private  String lastName;
	Scanner s= new Scanner(System.in);
	void  setFirstName()
	{ System.out.println("Please enter your First Name :");
	  firstName= s.nextLine();
	 }
	  void setLastName()
	  { System.out.println("Please enter your Last Name :");
	    lastName= s.nextLine();
		}
		public String toString()
		{ return firstName+" "+lastName;}
		public static void main(String args[])
		{ Person p= new Person();
		  p.setFirstName();
		  p.setLastName();
		 System.out.println(p);}
		 }