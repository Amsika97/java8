package org.java.eighth.feature;
@FunctionalInterface
interface demo{
	public void show();
}

public class Method_Reference_Demo {	
	

	public static void display() {
		System.out.println("trying to use method reference with static method.....");
	}
	
	public void content() {
		System.out.println("trying to use method reference with instance method of particular object");
	}
	
	public Method_Reference_Demo() {

		System.out.println("trying to use method reference with constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         //----------------with lambda expression-----------//
		
//		demo d =()->{
//			System.out.println("trying to use method reference.....");
//		};
//		
//		d.show();
		
		//----------------with method reference using static-----------//
		
		demo d = Method_Reference_Demo::display;
		d.show();
		
		//----------------with method reference using instance method-----------//
		
		Method_Reference_Demo m = new Method_Reference_Demo();
		demo d1 = m::content;
		d1.show();
		
		//----------------with method reference using constructor-----------//
		demo d2 = Method_Reference_Demo::new;
		d2.show();

	}

}
