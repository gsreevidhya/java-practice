//geeksforgeeks OOP exercise (13/25) Program to display car details by initializing variables with a constructor
class CarDetails
{ String make;
  String model;
  int year;
  CarDetails( String make, String model, int year)
  { this.make= make;
    this.model= model;
	this.year= year;}
	void displayDetails()
	{ System.out.println("Car Make: "+make);
	  System.out.println("Car Model: "+model);
	  System.out.println("Year: "+year);}
	  public static void main( String args[])
	  { CarDetails cd= new CarDetails("Ford","Explorer",2018);
	  cd.displayDetails();}
	  }