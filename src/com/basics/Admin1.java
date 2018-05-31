package com.basics;

public class Admin1 {
	public static void main(String args[]) {
Invoice invoice1=new Invoice();
invoice1.setPartDescription("bingo");
invoice1.setPartNumber("bbb");
invoice1.setQuantity(20);
invoice1.setPrice(-10);
invoice1.invoiceamount();
System.out.println(invoice1.getPartDescription());
System.out.println(invoice1.getPartNumber());
System.out.println(invoice1.getQuantity());
System.out.println(invoice1.getPrice());
	}
	}
