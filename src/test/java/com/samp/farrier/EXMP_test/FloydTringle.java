package com.samp.farrier.EXMP_test;

import java.util.Scanner;

public class FloydTringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, num =1;
		System.out.println("enter the number of rows of floyed triangle");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
		
	}

}
