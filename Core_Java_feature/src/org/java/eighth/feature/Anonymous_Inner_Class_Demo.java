package org.java.eighth.feature;

 class M{
	public void show() {
		System.out.println("From outer A class");
	}
}

 abstract class N{
	 public void display() {
		 
	 }
 }

public class Anonymous_Inner_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		M obj = new M();
//		obj.show();
		
		M obj =new M() {
			public void show() {
				System.out.println("From Anonymous Inner Class");
			}	
		};
		
		obj.show();
		
		
		N obj1 = new N() {
			public void display() {
				System.out.println("using anonymous inner class for abstract classs");
			}
		};
		obj1.display();

	}

}
