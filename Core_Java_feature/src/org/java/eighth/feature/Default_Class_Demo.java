package org.java.eighth.feature;

interface book{
	
	public void show(); //abstract method
	
	default void display() {
		System.out.println("Hi from default method");
	}	
	
	public static void add(int a, int b) {
		System.out.println("adding from static method = "+(a+b));
	}
}

public class Default_Class_Demo implements book {
	
	public void show() {
		System.out.println("Hi from abstract method of interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Default_Class_Demo d = new Default_Class_Demo();
		
		d.show();
		d.display();
//		d.add(10,20); // error
//		Default_Class_Demo.add(10,20);  //error
		book.add(10,20);

	}

}
