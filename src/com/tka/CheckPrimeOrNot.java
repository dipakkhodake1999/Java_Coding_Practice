package com.tka;

import java.util.Scanner;

public class CheckPrimeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your number that you check :");
		int num=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+" is prime number");
		}else{
			System.out.println(num +" is not a prime number");
	
		}
	}

}
