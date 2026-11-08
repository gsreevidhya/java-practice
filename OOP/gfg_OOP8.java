//geeksforgeeks OOP exercise (8/25) Program to create multiple instances of a student class
import java.util.Scanner;
class Student
{ private String name;
 private int rollNo;
 private double marks;
 Scanner s= new Scanner(System.in);
 String setName()
 { System.out.println("Please enter the name");
   name= s.nextLine();
   return name;}
   int setRollNo()
   { System.out.println("Please enter the Roll Number");
    rollNo= s.nextInt();
	return rollNo;}
	String grade(double marks)
	{ if( marks>=90&&marks<=100)
	  return "A-grade";
	  else if( marks>=80&&marks<90)
	  return "B-grade";
	  else if( marks>=70&&marks<80)
	  return "C-grade";
      else if(marks<0||marks>100)
		  return "invalid";
	  else
	  return"Fail";  }

	double setMarks()
	{ System.out.println("Please enter the marks");
	  marks= s.nextDouble();
	  return marks;}
	  public static void main( String args[])
	  { System.out.println("Enter the number of students");
	    Scanner s= new Scanner(System.in);
	    int students= s.nextInt();
		for ( int i=1;i<=students;i++)
		{
			Student st= new Student();
		  System.out.println("Name of the student is :"+st.setName());
		  System.out.println("Roll Number of student is :"+st.setRollNo());
		  double marks= st.setMarks();
		  System.out.println("Marks of student is :"+marks);
		  System.out.println("Grade of student is :"+st.grade(marks));
		  
		  }
		  }
		  }
		  