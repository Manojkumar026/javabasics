package com.basics;

public class WorkSheet2 {
	public static void main( String[] args )
	{
	int y;
	int x = 1;
	int count = 1;
	int total = 0;
	int row = 10;
	int column;


	 while ( x <= 10 )
	 {
	 y = x * x;
	 System.out.println( y );
	 total += y;
	 ++x;
	 } 

	 System.out.printf( "Total is %d\n", total );

	  


{


while ( count <= 10 )
{
 System.out.println( count % 2 == 1 ? "****" : "++++++++" );
 ++count;
 } 
 } 
 
	{
		
		while ( row >= 1 )
		 {
		 column = 1;

		 while ( column <= 10 )
		 {
		 System.out.print( row % 2 == 1 ? "<" : ">" );
		 ++column;
		 } 

		 --row;
		 System.out.println();
		 } 
		 } 
		 }
}


