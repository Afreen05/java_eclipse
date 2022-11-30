package com.xworkz.javaPrograms;

public class Program3 {
        
	public static void main(String[] args) {    
        
        String str1="Good Afternoon";    
            
           
        str1 = str1.replaceAll("\\s+", "");    
            
        System.out.println("String after removing all the white spaces : " + str1);    
    }    
}
