package org.java.eighth.feature;

 class A{
	 int a=10;
	 
	 public void display() {
		 System.out.println("Hi from A class");
	 }
	 
	 class B{
		 public void show() {
			 System.out.println("data from inner B class"); 
		 }
	 }
		 
	static class C{
		public void config() {
		System.out.println("output from static inner C class");
	}
	 }
	
}
public class Inner_Class {

	public static void main(String[] args) {

		A obj = new A();
		obj.display();
		System.out.println("Variable from a = "+ obj.a);
		
		A.B obj1 = obj.new B();
		obj1.show();
		
		A.C obj2 = new A.C();
		obj2.config();
		

	}

}
