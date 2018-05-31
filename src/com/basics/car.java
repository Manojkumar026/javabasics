package com.basics;

public class car {
	String model;
	double speed;
	public car() {
	}
	public boolean start() {
		return true;
	}
	public void accelerate() {
	}
	public static void main(String[] args) {
		car car1 = new car();
		car car2= new car();
		
		car1.speed = 40.0;
		car2.speed = 60.0;
		System.out.println(car1.speed);
		System.out.println(car2.speed);
		
	}

}
