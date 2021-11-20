package it.ms.testgit;

public class Main {

	public static void main(String[] args) {
		
		SalesData data = new SalesData();
		displayGreeting();
		data.display();

		//Modifica da portare sul master  MOD_N01
		

	}
	
	private static void displayGreeting(){
		System.out.println("HELLO ");
		System.out.println("SHOWS SALES DATA");
		System.out.println("Woot It Pushed");
		System.out.println("New Woot It Pushed");
	}

}
