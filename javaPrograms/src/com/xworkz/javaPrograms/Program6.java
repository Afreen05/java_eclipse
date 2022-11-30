package com.xworkz.javaPrograms;

public class Program6 {
         
	
		
		public static void  basicMathOp(char operation, int value1, int value2) {
			  if (operation == '+') 
				  
			  {
				  int add= value1 + value2;
				  System.out.println(add);
			    
			  }
			  if (operation == '-') {
				  int sub= value1 - value2;
				  System.out.println(sub);
			  }
			  if (operation == '*') {
				  int mul= value1 * value2;
				  System.out.println(mul);
			  }
			  if (operation == '/') {
				  int div= value1 / value2;
				  System.out.println(div);
			  }
		}
		public static void main(String[] args) {
			basicMathOp('+', 4, 4);  
			basicMathOp('-', 4, 4);  
			basicMathOp('*', 4, 4);  
			
		}
			
			
			
			
	
}
