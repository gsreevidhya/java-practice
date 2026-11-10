//geeksforgeeks OOP exercise (11/25) Program to count the no.of objects in a class
class CountObjects
{ 
  static int count;
  CountObjects()
  { count++;}
  void print()
  { System.out.println("The no.of Objects are: "+count);}
  public static void main( String args[])
  { CountObjects co1= new CountObjects();
    co1.print();
	CountObjects co2= new CountObjects();
	co2.print();
	CountObjects co3= new CountObjects();
	co3.print();
	CountObjects co4= new CountObjects();
	co4.print();
}
}	
	