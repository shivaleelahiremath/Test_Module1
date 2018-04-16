package com.samp.farrier.EXMP_test;

import java.util.Scanner;

public class reverseString {
	   public static void main(String args[])
	   {
		   
		   //reverse string using charAt method
		   String origin = "Happy new years";
//		   String origin;
		   String reversal = "";
//		   Scanner scr = new Scanner(System.in);
//		   System.out.println("enter the string");
//		   origin = scr.nextLine();
		   for(int i =origin.length()-1; i>=0; i--){
			   reversal = reversal + origin.charAt(i);
		   }
		   System.out.println(reversal);
		   
		   //using stringBuilder and StringBuffer method
		   StringBuilder val = new StringBuilder("valuew of qwww");
		   System.out.println(val.reverse());
	       StringBuffer a = new StringBuffer("Java programming is fun");     
	       System.out.println(a.reverse());
	       
	       //palindrom 
	       String original = "asdsa asdsa";
	       String reverse1= "";
	       for(int i=original.length()-1; i>=0; i--)
	    	   reverse1 = reverse1 + original.charAt(i);
	       
	       if(original.equals(reverse1))
	    	   System.out.println("given val is palindrom");
	       else
	    	   System.out.println("given val is not palindrom");       
	   }
}
