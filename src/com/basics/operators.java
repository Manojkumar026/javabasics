package com.basics;

public class operators {
	public static void main(String[] args) {
		int count =10;
		count++;
		count--;
		
		
		int negcount=-20;
		boolean isTrue =false;
		System.out.println(!isTrue);
		
		System.out.println( count > 20);
		System.out.println( count < 20);
		
		System.out.println( count >= 10);
		System.out.println( count <= 10);
		
		System.out.println( count == 10);
		System.out.println( count != 20);
		
		System.out.println( 6 & 3);
		
		System.out.println( 6 | 3);
		
		System.out.println( 6 ^ 3);
		
		System.out.println(count == 10 & isTrue);
		System.out.println(count == 10 | isTrue);
		
		System.out.println(isTrue & confirm());
		
		System.out.println(20 + 30 - -2 * (3 + 4) + 2 + 3 + "Good" +(5 * 2) + 3);
		
	}
	public static boolean confirm()
	{
		System.out.println("confirm (); called ");
		return true;
	}
	}


