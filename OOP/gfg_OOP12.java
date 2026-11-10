//geeksforgeeks OOP exercise (12/25) Program to accept a Student's name, marks of three subjects, total and average
import java.util.Scanner;
class Student
{ String student;
  int marks1;
  int marks2;
  int marks3;
  int total;
  double avg;
  void avg()
 { Scanner s= new Scanner(System.in);
   System.out.println("Please enter the student's name: ");
   student= s.nextLine();
   System.out.println("Please enter 1st subject marks: ");
   marks1= s.nextInt();
   System.out.println("Please enter 2nd subject marks: ");
   marks2= s.nextInt();
   System.out.println("Please enter 3rd subject marks: ");
   marks3= s.nextInt();
   total= marks1+marks2+marks3;
   avg= total/3;
   System.out.println("Name: "+student);
   System.out.println("1st subject marks: "+marks1);
   System.out.println("2nd subject marks: "+marks2);
   System.out.println("3rd subject marks: "+marks3);
   System.out.println("total marks: "+total);
   System.out.println("average marks: "+avg);}
   public static void main(String args[])
   { Student s= new Student();
   s.avg();}
   }
   
   
      