/**
 * 
 */
package JavaTraining;

/**
 * @author suraj
 *
 */

public class Areas {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.out.println("Choose the type of object to find area");
		System.out.println("\t1.Oval");
		System.out.println("\t2.Triangle");
		System.out.println("\t3.Rectangle");
		System.out.println("\t4.Pentagon");
		System.out.println("\t5.Hexagon");
		System.out.println("\t6.Trapezium");
		System.out.println("t7.Circle");
		
		
		int option=scan.nextInt();
	if (option==1)
	{
		System.out.println("Enter the dimensions of the Oval");
        int width=scan.nextInt();
		int Length=scan.nextInt();
		double area=scan.nextDouble();
		System.out.println("The area of the Oval is" +area);
		
	}
	
	else if("optin==2")
	{
		System.out.println("Enter the dimensions of the Triangle");
        int base=scan.nextInt();
		int height=scan.nextInt();
		double area=1/2*base*height;
		System.out.println("The area of the Triangle is" +area);
	
	}
	
	else if ("optin==3")
	{
		System.out.println("Enter the dimensions of the Rectangle");
        int width=scan.nextInt();
		int Length=scan.nextInt();
		double area=scan.nextDouble();
		System.out.println("The area of the Rectangle is" +area);

	}
	}

}