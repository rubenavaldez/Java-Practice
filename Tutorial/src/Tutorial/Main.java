package Tutorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	Primitive data types - not changeable 
		// integer whole number 			
		int hello_world = 5; 
		
		// number with a decimal place 
		double num2 = 5.0;
		
		// boolean true or false 
		boolean b = false;
		
		// Char any single character
		// can be quotes or Unix code 
		char c = 'h';
		
		// String multiple characters in double quotes  
		String str ="tim";
		
//		assigning the value from another variable 
		int tim = hello_world; 
		
//		System.out.println(str);
		
		
// Operations 
		// declare a variable, not initialized 
		int x;
		x= 5;
		
		int y = 7;
		int z =56;
		int sum = x + y + z ;
		int diff = x - y - z ;
		int prod = x * y * z ;
		
//		order of operations - left to right 
		int oper = x * y / z ;
		
//		brackets will happen first 
		int oper2 = (x * y) / z ;

		
//		division 
		int quot = z / 7;
				 
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(prod);
		System.out.println(oper);
		System.out.println(oper2);
		
		
	}

}
