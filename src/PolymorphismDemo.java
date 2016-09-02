//Keller Han
//Write a demo class that will exhibit polymorphism by initiating the subclasses of person and employee. Each new object
//will have its own unique values to be displayed, using a for loop. The values are determined by having already written values into
//each class' constructor

public class PolymorphismDemo {
	
	/*-------------------------------------------------------------
	|  Method: [Main]
	|
	|  Purpose:  [To create a polymorphism demo where we initiate 3 instances of undergraduate, 1 of student, 1 of faculty, and 1 of staff.
				We will input values into the constructor and 2 for loops will output the necessary values for each object.]
	|
	|  Pre-condition:  [Person and employee, and all of their subclasses must contain all the methods and constructors necessary to initialize the objects and 
						output its values using for loops]
	|
	|  Post-condition: [Each subclass will have its own unique values displayed such as name, ID, deperatment, title, student number, etc...]
	|
	|  Parameters: [N/A]
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public static void main(String[] args)
	{
		Person[] people = new Person[4];
		Employee2[] employee = new Employee2[2];

		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);
		employee[0] = new Faculty("Edwards, Stephen", 2877, "Computer Science Department", "Professor of Computer Science");
		employee[1] = new Staff("Boyer, John", 1919, "Math Department", "Professor of Math Analytics", 20);

		for (Person p : people)
		{
			p.writeOutput();
			System.out.println();
		}
		
		for (Employee2 e : employee)
		{
			e.writeOutput();
			System.out.println();
		}
	}
}