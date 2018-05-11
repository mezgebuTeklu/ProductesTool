package org.demo.productestool;

public class Main {
	public static void displayGreeting() {
	
		System.out.println("Hello Client A");
		System.out.println("Hello Client B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleData data = new SaleData();
		displayGreeting();
		data.display();

	}

}
