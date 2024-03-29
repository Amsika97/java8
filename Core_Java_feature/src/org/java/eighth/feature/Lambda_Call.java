package org.java.eighth.feature;

public class Lambda_Call {
	
	@FunctionalInterface
	 interface functional_demo {
		
//		public void dispaly();
//		public void add(int a, int b);
//		public void square(int x);
		public int add(int a, int b);
	}

	public static void main(String[] args) {
		
		
		//-----------------------------Display---------------------------------//	
		
//		functional_demo FD = () ->{
//			System.out.println("Calling Lambda Expression Using Functional Interface");
//		};
//		
//		FD.dispaly();
         //----------------------------Add----------------------------------//		
//		functional_demo FD = (a,b) ->{
//		System.out.println("adding = "+ (a+b));
//		
//		};
//		
//		FD.add(10,20);
		
                //-----------------------------Sqaure---------------------------------//		
		
//		functional_demo FD = (x) -> System.out.println("square = "+ (x*x));
//		FD.square(5);
		
		//----------------------------Adding with return type----------------------------------//

		functional_demo FD =(a,b)-> a+b;
		int result = FD.add(5,10);
		System.out.println("result with return = "+result);
	}

}
