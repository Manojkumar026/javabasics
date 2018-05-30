package com.basics;

public class WorkSheet3 {
	public static void main( String[] args ) {
	int i = 1;
	while(i <=10)
	{
	++i;
	System.out.println(i);
	}
	for (float k= 0.1f; k<=1.0; k += 0.1 )
	{
	System.out.println( k );
	}
	int n = 2;
	switch(n)
	
	{
	case 1:
	System.out.println( "The number is 1" );
	break;
	case 2:
	System.out.println( "The number is 2" );
	break;
    
	default:
	System.out.println( "The number is not 1 or 2" );
	break;
	}

	
	
		 int m = 1;
	while (m < 10 )
	System.out.println( m++ );

}
}

