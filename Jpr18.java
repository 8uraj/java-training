package com.Training;

public class Jpr18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int  principle =161258;//amount
      double rate =0.05d;
      double EMI;
      int t1=3; //3 years 
      int t2=5; //5 years 
      rate=rate/(12*100);
      // EMI of 3 Years of amount 161258
      t1=t1*12;
      EMI=(principle*rate*Math.pow(1+rate,t1))/(Math.pow(1+rate,t1)-1);
      System.out.println("EMI of 3 years is "+EMI);
      
      // EMI of 5 Years of amount 161258
      
      t2=t2*12;
      EMI=(principle*rate*Math.pow(1+rate,t2))/(Math.pow(1+rate,t2)-1);
      System.out.println("EMI of 5 years is "+EMI);
      
       
     
	}

}
