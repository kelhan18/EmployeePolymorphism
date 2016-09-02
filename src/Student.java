//Keller Han
//The student class is a subclass of person and has instance variables to store a student's id number as an int


public class Student extends Person
{
	//initialize variables
    private int studentNumber;

    //initialize constructors
    public Student( )
    {
        super( );
        studentNumber = 0;//Indicating no number yet
    }

    public Student(String initialName, int initialStudentNumber)
    {
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    /*-------------------------------------------------------------
	|  Method: [reset(String newName, int newStudentNumber)]
	|
	|  Purpose:  [This method, if called, will reset the existing name and student number to new ones.]
	|
	|  Pre-condition:  [studentNumber must be defined]
	|
	|  Post-condition: [The student's studentNumber and name will be set to the new ones.]
	|
	|  Parameters:
	|      studentNumber - the student number of student
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
    
    public void reset(String newName, int newStudentNumber)
    {
        setName(newName);
        studentNumber = newStudentNumber;
    }

    /*-------------------------------------------------------------
	|  Method: [getStudentNumber()]
	|
	|  Purpose:  [This method, if called, will return the student's new student number.
	|
	|  Pre-condition:  [The variable studentNumber must be defined as int]
	|
	|  Post-condition: [The student's studentNumber will be returned
	|
	|  Parameters:
	|      studentNumber - the student number of student
	|
	|  Returns:  [the studentNumber of the student]
	*------------------------------------------------------------------*/
    
    public int getStudentNumber( )
    {
        return studentNumber;
    }

    /*-------------------------------------------------------------
	|  Method: [setStudentNumber(int newStudentNumber)]
	|
	|  Purpose:  [This method, if called, will take an int input that will become the student's new student number.
	|
	|  Pre-condition:  [The variable studentNumber must be defined as int]
	|
	|  Post-condition: [The student's studentNumber will be set to newStudentNumber
	|
	|  Parameters:
	|      studentNumber - the student number of student
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
    
    public void setStudentNumber(int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }

    /*-------------------------------------------------------------
	|  Method: [writeOutput()]
	|
	|  Purpose:  [This method, if called, will print the name and student number of the student.]
	|
	|  Pre-condition:  [The variable studentNumber must be defined as int]
	|
	|  Post-condition: [The student's name and student number will be displayed
	|
	|  Parameters:
	|      studentNumber - the student number of student
	|
	|  Returns:  [name and student number of student]
	*------------------------------------------------------------------*/
    
    public void writeOutput( )
    {
        super.writeOutput();
        System.out.println("Student Number: " + studentNumber);
    }

    /*-------------------------------------------------------------
	|  Method: [equals(Student otherStudent)]
	|
	|  Purpose:  [This method, if called, will check to see if another student has the same student number
	|
	|  Pre-condition:  [The variable studentNumber must be defined as int]
	|
	|  Post-condition: [Returns true of false depending if another student has the same student number
	|
	|  Parameters:
	|      studentNumber - the student number of student
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
    
    public boolean equals(Student otherStudent)
    {
        return this.hasSameName(otherStudent) &&
              (this.studentNumber == otherStudent.studentNumber);
    }
    
}
