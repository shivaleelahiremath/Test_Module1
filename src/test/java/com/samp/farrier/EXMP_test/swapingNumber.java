package com.samp.farrier.EXMP_test;

public class swapingNumber {
	   public static void main(String args[])
	   {
		   //with using temp variable
		    int x = 4 , y = 9, temp;
		    System.out.println("before swap: "+x+ " "+y);
		    temp = x;
		    x=y;
		    y=temp;
		    
		    System.out.println("after swap: "+x+ " "+y);

	
			//without using temp variable
		    System.out.println("before swap: "+x+ " "+y);
		
		    x= x+y;
		    y= x-y;
		    x= x-y;
		    
		    System.out.println("after swap: "+x+ " "+y);
	   }
}
