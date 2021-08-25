/**
 * 
 */
package JavaTraining;

/**
 * @author suraj
 * 
 */
//code for demonstrate inheritance

// super class Apple
class Apple{
    static String company="Apple";
    int noOfEmployees=90000;
    void print(){
        System.out.println("Welcome to "+company);
        System.out.println("We have "+noOfEmployees+" no of employees.");
    }
    void work(){
        System.out.println("We are working in Apple");
    }
}
/*
Single inheritance
Super class-Apple
 child class- Development*/

class Development extends Apple{
    int noOfEmployees=8000;
    void print(){
        System.out.println("We have "+noOfEmployees+" no of employees in development department.");
    }
    void work(){
        System.out.println("We are working in development department of "+company);
    }

}

/*
hierarchical inheritance
Super class-Apple
 child class- Design*/

class Design extends Apple{
    int noOfEmployees=12000;
    void print(){
        System.out.println("We have "+noOfEmployees+" no of employees in design department.");
    }
    void work(){
        System.out.println("We are working in design department of "+company);
    }
}

/*
multilevel inheritance
first super class-Apple
Second Super class-Design
 child class- Testing */

class Testing extends Design{
    int noOfEmployees=19000;
    void print(){
        System.out.println("We have "+noOfEmployees+" no of employees in testing department.");
    }
    void work(){
        System.out.println("We are working in testing department of "+company);
    }
}

/*
single inheritance
Super class-Apple
 child class- Sales*/

class Sales extends Apple{
    int noOfEmployees=18000;
    void print(){
        System.out.println("We have "+noOfEmployees+" no of employees in sales department.");
    }
    void work(){
        System.out.println("We are working in sales department of "+company);
    }
}

/*
multilevel inheritance
first Super class-Apple
second super class- Sales
 child class- Account*/

class Account extends Sales{
    int noOfEmployees=38000;
    void print(){
        System.out.println("We have "+noOfEmployees+" no of employees in account department.");
    }
    void work(){
        System.out.println("We are working in account department of "+company);
    }
}

public class JPR24 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		  Apple a1=new Apple();
	        a1.print();
	        a1.work();

	        Development d1=new Development();
	        d1.work();
	        d1.print();

	        Design ds=new Design();
	        ds.print();
	        ds.work();

	        Testing t1= new Testing();
	        t1.print();
	        t1.work();

	        Sales s1=new Sales();
	        s1.print();
	        s1.work();

	        Account ac=new Account();
	        ac.work();
	        ac.print();
	    }


	}


