/**
 * 
 */
package JavaTraining;

//JavaFX application class must extend javafx.application.Application

/**
 * @author suraj
 *
 */

public class EmployeeID
	{
	    private String firstName; 
	    private String lastName;
	    private int id; 
	     
	    public int nextUniqueId = 0;
	    public Scanner sc = new Scanner(System.in);
	     
	    public Employee() 
	    {
	        firstName = " ";
	        lastName = " ";
	        nextUniqueId = 0;
	        id = nextUniqueId;
	    }
	 
	    /**
	     *
	     * @param firstName
	     * @param lastName
	     * @param id
	     */
	    public EmployeeID(String firstName, String lastName, int id) //constructor
	    {
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.id = id;
	    }  
	    public int getId() 
	    {
	 
	       return id;
	    }
	    public void setId( int id ) 
	    {
	      this.id = id;
	    }
	    public void setFirstName(String firstName)
	    {
	        this.firstName = firstName;
	    }        
	    public String getFirstName()
	    {
	        return firstName;
	    } 
	    public void setLastName (String lastName)
	    {
	        this.lastName = lastName;
	    }        
	    public String getLastName()
	    {
	        return lastName;
	    } 
	     
	   
	    @Override
	    public String toString()
	  {
	      return "First Name:           " + firstName + "\n" +
	             "Last Name:            " + lastName  + "\n" +
	             "Employee ID:          " + id        + "\n" ;
	  }


	I need to create a method in my main class to make an employee object that has their first name, last name, and generate an employee id. I have tried several times and I cannot get this to work properly. Here is my main class.


	?
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
	11
	12
	13
	14
	15
	16
	17
	18
	19
	20
	21
	22
	23
	24
	25
	26
	27
	28
	29
	30
	31
	32
	33
	34
	35
	36
	37
	38
	39
	40
	41
	42
	43
	44
	45
	46
	47
	48
	49
	50
	51
	52
	53
	54
	55
	56
	57
	58
	59
	60
	61
	62
	63
	64
	65
	66
	67
	68
	69
	70
	71
	72
	73
	74
	75
	76
	77
	78
	79
	80
	81
	82
	83
	84
	85
	86
	87
	package employeetimeclock;
	 
	import java.util.Scanner;
	 
	/**
	 *
	 * @author Owner
	 */
	public class EmployeeTimeClockApp
	{
	    private static Scanner sc = null;
	    public static EmployeeFile employeefile = new EmployeeFile();
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args)
	    {
	        System.out.println("        Welcome     ");
	        System.out.println();
	                  
	        sc = new Scanner(System.in);
	        displayMenu();
	       
	        String choice = "";
	         
	        while (!choice.equalsIgnoreCase("d"))
	          {    
	            choice = Validator.getString(sc,
	                           "  Enter a choice: ");
	                           System.out.println();  
	                            
	            if ("a".equalsIgnoreCase(choice))    
	                getEmployees();
	            else if (choice.equalsIgnoreCase("b"))
	                System.out.println("You chose to punch in or out");
	            else if (choice.equalsIgnoreCase("c"))
	                System.out.println("You chose to pull a report");
	            else if (choice.equalsIgnoreCase("d"))
	                System.out.println("Goodbye");
	            else
	                System.out.println("Error! Not a valid command.\n");
	     
	         }//end while    
	}//end main
	    public static void displayMenu()
	    {
	        System.out.println("  EMPLOYEE TIME CLOCK");
	        System.out.println();
	        System.out.println("   A)Add New employee");
	        System.out.println("   B)Punch In/Out    ");
	        System.out.println("   C)Report          ");
	        System.out.println("   D)Exit            ");
	        System.out.println();
	        
	    }
	     
	    public static void getEmployees()
	    {
	        System.out.println("    Add New Employee ");
	        System.out.println();
	        
	        String firstName = Validator.getString(
	            sc, "Enter First Name: ");
	        String lastName = Validator.getString(
	            sc, "Enter Last Name: ");
	         
	        Employee employee = new Employee();
	        employee.setFirstName(firstName);
	        employee.setLastName(lastName);
	        employee.getId();
	        employeefile.addEntry(employee);
	         
	         
	        System.out.println("Employee Id:   "  + employee.getId() + "\n");
	        System.out.println();
	        System.out.println(firstName + " " + lastName +
	            " has been added.\n");
	         
	         
	        String answer = Validator.getStringContinue(sc, "Add another employee?: (y/n)");
	        System.out.println();
	        System.out.println();
	         if(answer.equalsIgnoreCase("y"))
	         getEmployees(); 
	    }        
	     
	    }//end employeeApp

}
