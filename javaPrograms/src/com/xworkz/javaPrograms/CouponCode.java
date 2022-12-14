package com.xworkz.javaPrograms;

import java.util.Scanner;

public class CouponCode {
 
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String coupon = scan.next();
		
		String str1=coupon.substring(0,2);
		System.out.println(str1);
		
		String str2=coupon.substring(2,6);
		System.out.println(str2);
		
		String str3=coupon.substring(6,9);
		System.out.println(str3);
   
		//  int convertString = Integer.parseInt(str2);
		
		int convertString1=Integer.valueOf(str2);
		//System.out.println("convert string to int : "+convertString1);
		if(coupon.length() == 9 && convertString1 == 2022) {
			int count = 0;
			if(str3.charAt(str3.length()-1) >='A' && str3.charAt(0) <= 'Z') {
				
				if(str1.charAt(0)>='A' && str1.charAt(0)<='Z') {
					count++;
				}
		}
	  
			if(count==0) {
				System.out.println("coupon is valid : "+coupon);
			}
		
		else {
			System.err.println("coupon is invalid :"+coupon);
		}
	}
	}
}
