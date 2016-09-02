//Keller Han
//The employee2 class has instance variables to store an employee's name as a String, their ID as int, and their department as a String.
//It is the superclass of faculty and staff

public class Employee2 
{
	//initialize variables
	private String name;
	private int ID;
	private String department;
	
	//initialize constructors
	public Employee2()
	{
		name = "No name yet";
		ID = 0;
		department = "No depertment yet";
	}
	
	public Employee2(String initialName, int initialID, String initialDepartment)
	{
		name = initialName;
		ID = initialID;
		department = initialDepartment;
	}
	
    /*-------------------------------------------------------------
	|  Method: [setName(String newName)]
	|
	|  Purpose:  [This method, if called, will set the name of employee2 to newName.]
	|
	|  Pre-condition:  [The variable name must be defined as String]
	|
	|  Post-condition: [newName becomes the name of employee2
	|
	|  Parameters:
	|     	name - the name of employee2
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void setName(String newName)
    {
        name = newName;
    }
    
	/*-------------------------------------------------------------
	|  Method: [setID(int newID)]
	|
	|  Purpose:  [This method, if called, will set the ID of employee2 to newID.]
	|
	|  Pre-condition:  [The variable ID must be defined as int]
	|
	|  Post-condition: [newID becomes the ID of employee2
	|
	|  Parameters:
	|     	ID - the ID of employee2
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void setID(int newID)
	{
		ID = newID;
	}
	
	/*-------------------------------------------------------------
	|  Method: [setDepartment(String newDepartment)]
	|
	|  Purpose:  [This method, if called, will set the department of employee2 to newDepartment.]
	|
	|  Pre-condition:  [The variable department must be defined as String]
	|
	|  Post-condition: [newDepartment becomes the department of employee2
	|
	|  Parameters:
	|     	department - the department of employee2
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void setDepartment(String newDepartment)
	{
		department = newDepartment;
	}
	
	/*-------------------------------------------------------------
	|  Method: [getName()]
	|
	|  Purpose:  [This method, if called, will return the name of employee2]
	|
	|  Pre-condition:  [The variable name must be defined as String]
	|
	|  Post-condition: [name of employee 2 is returned.]
	|
	|  Parameters:
	|     	name - the name of employee2
	|
	|  Returns:  [the name of employee2]
	*------------------------------------------------------------------*/
	
    public String getName( )
    {
        return name;
    }
    
	/*-------------------------------------------------------------
	|  Method: [getID()]
	|
	|  Purpose:  [This method, if called, will return the ID of employee2]
	|
	|  Pre-condition:  [The variable ID must be defined as int]
	|
	|  Post-condition: [ID of employee 2 is returned.]
	|
	|  Parameters:
	|     	ID - the ID of employee2
	|
	|  Returns:  [the ID of employee2]
	*------------------------------------------------------------------*/
    
	public int getID()
	{
		return ID;
	}
	
	/*-------------------------------------------------------------
	|  Method: [getDepartment()]
	|
	|  Purpose:  [This method, if called, will return the department of employee2]
	|
	|  Pre-condition:  [The variable department must be defined as String]
	|
	|  Post-condition: [department of employee 2 is returned.]
	|
	|  Parameters:
	|     	department - the department of employee2
	|
	|  Returns:  [the department of employee2]
	*------------------------------------------------------------------*/
	
	public String getDepartment()
	{
		return department;
	}
	
	/*-------------------------------------------------------------
	|  Method: [writeOutput()]
	|
	|  Purpose:  [This method, if called, will display the name, ID, and department of employee2]
	|
	|  Pre-condition:  [The variable name, ID, and department must be defined]
	|
	|  Post-condition: [name, ID, and department of employee 2 is displayed]
	|
	|  Parameters:
	|     	name - the name of employee2
			ID - the ID of employee2
			department- the department of employee2
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void writeOutput( )
    {
		System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Department: " + department);
    }
	
}
