package com.basics;

import com.basics.examples;

public class examples { 
	public static void main(String [] args) {

    examples s = new examples();
    s.start();
}

void start() 
{
    int a = 3;
    int b = 4;
    System.out.print(" " + 7 + 2 + " ");
    System.out.print(a + b);
    System.out.print(" " + a + b + " ");
    System.out.print(foo() + a + b + " ");
    System.out.println(a + b + foo());
}
String foo() 
{
    return "foo";
}
}

