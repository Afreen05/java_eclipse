package com.xworkz.Programs;

public class P5 {

	public static void main(String[] args) {
		int n=4;
		for(int row=1;row<=n;row++) {
			
			for(int space=n-1;space>=row;space--) {
				System.out.print(" ");
			}
			for(int column=1;column<=row;column++) {
				System.out.print(column);
			}
			System.out.println("");
		}
	}

}
