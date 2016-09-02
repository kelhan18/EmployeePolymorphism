//Keller Han
//The faculty class has instance variables to store a faculty's title as String. It is a subclass of faculty

public class Faculty extends Employee2
{
	//initialize variables
	private String title;
	
	//initialize constructors
	public Faculty()
	{
		super();
		title = "No title yet";
	}
	
	public Faculty(String initialName, int initialID, String initialDepartment, String initialTitle)
	{
		super(initialName, initialID, initialDepartment);
		title = initialTitle;
	}
	
	/*-------------------------------------------------------------
	|  Method: [reset(String newName, int newID, String newDepartment, String newTitle)]
	|
	|  Purpose:  [This method, if called, will reset the name, ID, department, and title of faculty.]
	|
	|  Pre-condition:  [The variable title must be defined as String]
	|
	|  Post-condition: [name, ID, department, and title of faculty become the new values]
	|
	|  Parameters:
	|     	title - the title of faculty
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void reset(String newName, int newID, String newDepartment, String newTitle)
	{
		setName(newName);
		setID(newID);
		setDepartment(newDepartment);
		title = newTitle;
	}
	
	/*-------------------------------------------------------------
	|  Method: [setTitle(String newTitle)]
	|
	|  Purpose:  [This method, if called, will set the title of faculty as newTitle]
	|
	|  Pre-condition:  [The variable title must be defined as String]
	|
	|  Post-condition: [title of employee 2 is newTitle]
	|
	|  Parameters:
	|     	title - the title of faculty
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void setTitle(String newTitle)
	{
		title = newTitle;
	}
	
	/*-------------------------------------------------------------
	|  Method: [getTitle()]
	|
	|  Purpose:  [This method, if called, will return the title of faculty]
	|
	|  Pre-condition:  [The variable title must be defined as String]
	|
	|  Post-condition: [title of employee 2 is returned.]
	|
	|  Parameters:
	|     	title - the title of faculty
	|
	|  Returns:  [the title of faculty]
	*------------------------------------------------------------------*/
	
	public String getTitle()
	{
		return title;
	}
	
	/*-------------------------------------------------------------
	|  Method: [writeOutput()]
	|
	|  Purpose:  [This method, if called, will display the name, ID, department, and title of the faculty.]
	|
	|  Pre-condition:  [The variable title must be defined as String]
	|
	|  Post-condition: [name, ID, department, and title of faculty is displayed.]
	|
	|  Parameters:
	|     	title - the title of faculty
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void writeOutput( )
    {
		super.writeOutput();
        System.out.println("Title: " + title);
    }
}

