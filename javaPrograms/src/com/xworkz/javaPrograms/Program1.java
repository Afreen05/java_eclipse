package com.xworkz.javaPrograms;

public class Program1 {

	public static void main(String[] args) {
       
		//Write a program to count the number of
		//character in the given String without using length() Method.
		
		
				int length=0;
				
		                String s = "Afreen Ayaz";
		                char[] ch = s.toCharArray();
		                for (int i = 0; i < ch.length; i++){
		                	if(ch[i]!= ' ') {
		                		length++;
		                	}
		                	
						}
					
				System.out.println("Length of String is : "+length);
				
			}

		
	}


