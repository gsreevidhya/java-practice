\\ geeksforgeeks OOP exercise (3/25) A program to demonstrate Constructor overloading
import java.util.Scanner;
class Employee
{ String name;
  String dept;
  int empID;
  Employee(String name)
  { this.name=name;}
  Employee(String name, int empID) // constructor overloaded
  { this.name=name;
    this.empID= empID;}
  Employee(String name, int empID,String dept)
   { this.name=name;
    this.empID= empID;
	this.dept=dept;}
	void empDetails()
	{ if( name!=null)
	  System.out.println("Name: "+name);
  else
	  System.out.println("Name :"+name);
	  if(dept!=null)
	  System.out.println("Department :"+dept);
      else
		  System.out.println("Please enter Department");
	  if(empID!=0)
		  System.out.println("ID :"+empID);
	  else
		  System.out.println("Please enter the ID");
	}
	public static void main( String args[])
	 { Employee e1= new Employee("Vidhya");
	   e1.empDetails();
	   Employee e2= new Employee("Vidhya",101);
	   e2.empDetails();
	   Employee e3= new Employee("Vidhya",101,"HR");
	   e3.empDetails();
	   }
	   }