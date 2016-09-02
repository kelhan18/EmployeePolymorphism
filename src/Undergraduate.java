//Keller Han
//The Undergraduate class is a subclass of student and has instance variables to store a undergraduate's level as an int

public class Undergraduate extends Student
{
	//initialize variables
    private int level; //1 for freshman, 2 for sophomore,
                       //3 for junior, or 4 for senior.
    
    //initialize constructors
    public Undergraduate( )
    {
        super( );
        level = 1;
    }
    
    public Undergraduate(String initialName, int initialStudentNumber, 
                         int initialLevel)
    {
        super(initialName, initialStudentNumber);
        setLevel(initialLevel); //Checks 1 <= initialLevel <= 4
    }
    
    /*-------------------------------------------------------------
	|  Method: [reset(String newName, int newStudentNumber, int newLevel)]
	|
	|  Purpose:  [This method, if called, will reset the existing name, student number, and level to new ones.]
	|
	|  Pre-condition:  [level must be defined]
	|
	|  Post-condition: [The person's studentNumber, name, and level will be set to the new ones.]
	|
	|  Parameters:
	|      level - level of undergraduate
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
    
    public void reset(String newName, int newStudentNumber, 
	                  int newLevel)
    {
        reset(newName, newStudentNumber); //StudentÕs reset
        setLevel(newLevel); //Checks 1 <= newLevel <= 4
    }
    
    /*-------------------------------------------------------------
	|  Method: [getLevel()]
	|
	|  Purpose:  [This method, if called, will get the undergraduate's level
	|
	|  Pre-condition:  [The variable level must be defined as int]
	|
	|  Post-condition: [The undergraduate's level will be returned
	|
	|  Parameters:
	|     level - the level of the undergraduate
	|
	|  Returns:  [the level of the undergraduate]
	*------------------------------------------------------------------*/
    
    public int getLevel( )
    {
        return level;
    }
    
    /*-------------------------------------------------------------
 	|  Method: [setLevel(int newLevel)]
 	|
 	|  Purpose:  [This method, if called, will take an int input that will become the undergraduate's new level.]
 	|
 	|  Pre-condition:  [The variable level must be defined as int]
 	|
 	|  Post-condition: [The undergraduate's level will be set to newLevel.]
 	|
 	|  Parameters:
 	|  		level - the level of the student
 	|
 	|  Returns:  [N/A]
 	*------------------------------------------------------------------*/
    
    public void setLevel(int newLevel)
    {
        if ((1 <= newLevel) && (newLevel <= 4))
            level = newLevel;
        else
        {
            System.out.println("Illegal level!");
            System.exit(0);
        }
    }
    
    /*-------------------------------------------------------------
	|  Method: [writeOutput()]
	|
	|  Purpose:  [This method, if called, will print the name, student number, and level of the student.]
	|
	|  Pre-condition:  [The variable level must be defined as int]
	|
	|  Post-condition: [The undergradute's name, student number, and level will be displayed
	|
	|  Parameters:
	|      level - the level of undergraduate
	|
	|  Returns:  [name, student number, and level of undergraduate]
	*------------------------------------------------------------------*/
    
    public void writeOutput( )
    {
        super.writeOutput( );
        System.out.println("Student Level: " + level);
    }
 
    /*-------------------------------------------------------------
	|  Method: [equals(Undergraduate otherUndergraduate)]
	|
	|  Purpose:  [This method, if called, will check to see if another undergradute has the same level
	|
	|  Pre-condition:  [The variable level must be defined as int]
	|
	|  Post-condition: [Returns true of false depending if another undergraduate has the same level
	|
	|  Parameters:
	|      level - the level of the undergraduate
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
    
    public boolean equals(Undergraduate otherUndergraduate)
    {
        return equals((Student)otherUndergraduate) &&
               (this.level == otherUndergraduate.level);
    }

}
