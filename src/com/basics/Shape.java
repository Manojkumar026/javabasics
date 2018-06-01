package com.basics;

public class Shape {
	double side;
	double length;
	double breadth;
	
	
	public Shape(double side) {
		this.side =side;
	}
	public Shape(double  length,double  breadth) {
		if(length > 0.0 && length < 20.0) {
	
		this.length =length;
		this.breadth =breadth;
		}
	
	else {
			System.out.println("sorry this statement is not greater than 0 and less than 20");
		}}

 	public double findAreaofRectangle() {
 		
 		return  length * breadth;
 		
 	}
 	public static void main(String[] args) {
 		Shape square = new Shape(5);
 		Shape rectangle = new Shape(20,4);
 System.out.println(rectangle.findAreaofRectangle());
 	}
}
