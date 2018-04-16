package com.samp.farrier.EXMP_test;

public class PrintAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char ch = 'A'; ch<='Z'; ch++){
			System.out.println(ch);	
		}
		
		//while loop
		char ch1 = 'a';
		while(ch1<='z'){
			System.out.println(ch1);
			ch1++;	
		}
		
		//do while loop
		char ch2 = 'A';
		do{
			System.out.println(ch2);
			ch2++;
		}while(ch2<='Z');
		
		
	}

}
