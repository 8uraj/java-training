package com.Training;

public class Jpr17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double rate=0.05d;
        int principle=161258;//amount 
        int time=3; // 3 Months
        double si; //Simple Interest
        double ci; //compound Interest
      //Simple Interest 
        si=((principle*rate*time)/(100*12));
        System.out.println("Simple interest is "+ si);
      // compound Interest
        ci=principle*Math.pow(1+(rate/12),12)-principle;
        System.out.println("Compound interest is "+ ci);
        
        }//end main

}//end class
