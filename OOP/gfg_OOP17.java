//geeksforgeeks OOP exercise (17/25) Program to initialize employee details using command line arguments
class Employee
{ int empNo;
  String name;
  String dept;
  double salary;
 Employee(int empNo, String name, String dept, double salary )
  { this.empNo= empNo;
    this.name= name;
	this.dept= dept;
	this.salary= salary;}
	void print()
	{ System.out.println("Employee ID: "+empNo);
	  System.out.println("Employee Name: "+name);
	  System.out.println("Employee Department: "+dept);
	  System.out.println("Employee salary: "+salary);
	  }
	  public static void main(String args[])
	  { if(args.length!=4)
	    System.out.println("Please enter all the four details");
	  else
	  {
		int empNo=Integer.parseInt(args[0]);
		String name=args[1];
        String dept= args[2];
        double salary= Double.parseDouble(args[3]);
		Employee e= new Employee(empNo,name,dept,salary);
		e.print();}
		}
}
		
	  