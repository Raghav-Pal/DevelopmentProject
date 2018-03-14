package com.tx.dev.DevProject;

import java.math.BigInteger;

public class Factorial {
	
	public static void main(String[] args) {
		//int result = calculateFact(3);
		//System.out.println(result);
		//calculateFact3();
		calcualateSumOfSeries();
	}

	
	public static int calculateFact(int i) {
		
		int fact=i;
		System.out.println("fact is "+i);
		do{
			System.out.println("Inside While");
			fact=fact*(i-1);
			System.out.println("fact now is "+fact);
			i--;
		}while(i==0);
		
		return fact;
	}
	
	
	public static void calculateFact2() {
		//We will find the factorial of this number
        int number = 5;
        int fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
	}
	
	
	public static void calculateFact3() {
		
		Object p;
		p=1000000*10000;
		System.out.println("Print P : "+p);
		
		BigInteger reallyBig = new BigInteger("1234567890123456890");
		BigInteger notSoBig = new BigInteger("2743561234");
		reallyBig = reallyBig.add(notSoBig);
		System.out.println("Really Big : "+reallyBig);
		
		reallyBig = reallyBig.multiply(notSoBig);
		System.out.println("Really Big : "+reallyBig);
		
		reallyBig = reallyBig.multiply(notSoBig);
		System.out.println("Really Big : "+reallyBig);
		
		
		
		BigInteger a = BigInteger.valueOf(100000000);
		System.out.println(a);
		
		int number=3;
		int fact=1;
		for(int i=1; i<=number; i++) {
			fact = fact * i;
		}
		System.out.println("Fact is "+fact);
	}
		
		public static void calcualateSumOfSeries() {
			//for 3   3sq + 2sq + 1sq
			int n = 3;
			int sumResult=1;
			// 5
			for(int i=n; i>1; i--) {
				sumResult=sumResult+(i*i);
			}
			System.out.println("Sum : "+sumResult);
			
		}
	
}
