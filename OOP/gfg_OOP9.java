//geeksforgeeks OOP exercise (9/25) Program to find largest of three numbers by method overloading
class Largest
{
  int largest(int a, int b)
{
    return (a > b) ? a : b;
}

int largest(int a, int b, int c)
{
    return largest(largest(a, b), c);
}
public static void main( String args[])
{ Largest l= new Largest();
 int large= l.largest(4,2,7);
 System.out.println(large);}
 }
 