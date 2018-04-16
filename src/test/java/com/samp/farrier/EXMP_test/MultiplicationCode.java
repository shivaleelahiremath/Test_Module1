package com.samp.farrier.EXMP_test;

import java.util.Scanner;

public class MultiplicationCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			System.out.println("enter an number");
			Scanner in = new Scanner(System.in);
			n = in.nextInt();
			for(int i =1; i<=20; i++){
				System.out.println(n+ "*" +i+ "=" +n*i);
			}
			
			
	}

}
