package com.samp.farrier.EXMP_test;

import java.util.Random;

public class RandumNumber {
	public static void main(String args[]){
		
		//By Randon class
		Random random = new Random();
		for (int i=1; i<=10; i++){
			System.out.println(random.nextInt(100));
		}
		
		//By Math.random method..
		for(int i=1; i<=10; i++)
			System.out.println((int)(Math.random()*49+1));
	}
}
