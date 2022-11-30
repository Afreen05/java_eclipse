package com.xworkz.javaPrograms;

public class Program2 {

	public static void main(String[] args) {
         
		  
		      
		            
		        //Counter variable to store the count of vowels and consonant    
		        int vCount = 0, cCount = 0;    
		            
		        //Declare a string    
		        String str = "Afreen";    
		            
		        //Converting entire string to lower case to reduce the comparisons    
		        str = str.toLowerCase();    
		            System.out.println(str);
		        for(int i = 0; i < str.length(); i++) {  
		        	char c=str.charAt(i);
		            //Checks whether a character is a vowel    
		            if( c== 'a' || c== 'e' || c== 'i' || c == 'o' || c == 'u') {    
		                //Increments the vowel counter    
		                vCount++;    
		            }    
		            //Checks whether a character is a consonant    
		            else  {      
		                //Increments the consonant counter    
		                cCount++;    
		            }    
		        }    
		        System.out.println("Number of vowels: " + vCount);    
		        System.out.println("Number of consonants: " + cCount);    
		    }    
		
	}


