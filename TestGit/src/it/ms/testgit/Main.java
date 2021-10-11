package it.ms.testgit;

public class Main {

	public static void main(String[] args) {
		
		SalesData data = new SalesData();
		displayGreeting();
		data.display();
		

	}
	
	private static void displayGreeting(){
		System.out.println("HELLO ");
		System.out.println("SHOWS SALES DATA");
		
	}

}
