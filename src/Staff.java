//Keller Han
//The Staff class has instance variables to store a faculty's payGrade as int 1-20. It is a subclass of faculty

public class Staff extends Faculty 
{
	//initialize variables
	//int 1-20
	private int payGrade;
	
	//initalize constructors
	public Staff()
	{
		super();
		payGrade = 0;
	}
	
	public Staff(String initialName, int initialID, String initialDepartment, String initialTitle, int initialPay)
	{
		super(initialName, initialID, initialDepartment, initialTitle);
		payGrade = initialPay;
	}
	
	/*-------------------------------------------------------------
	|  Method: [reset(String newName, int newID, String newDepartment, String newTitle, int newPay)]
	|
	|  Purpose:  [This method, if called, will reset the name, ID, department, title, and paygrade of staff.]
	|
	|  Pre-condition:  [The variable payGrade must be defined as int]
	|
	|  Post-condition: [name, ID, department, title, and payGrade of staff will become the new vales.]
	|
	|  Parameters:
	|     	payGrade - the pay grade of staff
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void reset(String newName, int newID, String newDepartment, String newTitle, int newPay)
	{
		setName(newName);
		setID(newID);
		setDepartment(newDepartment);
		setTitle(newTitle);
		payGrade = newPay;
	}
	
	/*-------------------------------------------------------------
	|  Method: [setPay(int newPay)]
	|
	|  Purpose:  [This method, if called, will set the payGrade of staff as newPay.]
	|
	|  Pre-condition:  [The variable payGrade must be defined as int]
	|
	|  Post-condition: [payGrade of staff is newPay.]
	|
	|  Parameters:
	|     	payGrade - the pay grade of staff
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void setPay(int newPay)
	{
		payGrade = newPay;
	}
	
	/*-------------------------------------------------------------
	|  Method: [getPay()]
	|
	|  Purpose:  [This method, if called, will return the pay grade of staff.]
	|
	|  Pre-condition:  [The variable payGrade must be defined as int]
	|
	|  Post-condition: [payGrade of staff is returned.]
	|
	|  Parameters:
	|     	payGrade - the pay grade of staff
	|
	|  Returns:  [the payGrade of staff]
	*------------------------------------------------------------------*/
	
	public int getPay()
	{
		return payGrade;
	}
	
	/*-------------------------------------------------------------
	|  Method: [writeOutput()]
	|
	|  Purpose:  [This method, if called, will display the name, ID, department, and pay grade of staff.]
	|
	|  Pre-condition:  [The variable payGrade must be defined as int]
	|
	|  Post-condition: [name, ID, department, and payGrade of staff is displayed.]
	|
	|  Parameters:
	|     	payGrade - the pay grade of staff
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void writeOutput( )
    {
		System.out.println("Name: " + getName());
        System.out.println("ID: " + getID());
        System.out.println("Department: " + getDepartment());
        System.out.println("Pay Grade: " + payGrade);
    }
}
