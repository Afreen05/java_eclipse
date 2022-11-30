package com.xworkz.javaPrograms;

public class Program5 {
          
	public static void main(String[] args) {
        String name="Afreen Ayaz";
        System.out.println("Before Swap:\n"+name);
        String firstName=name.substring(0,name.indexOf(" "));
        String lastName=name.substring(name.indexOf(" "));
        String swapName=lastName+" "+firstName;
        System.out.println("After Swap:\n"+swapName);

    }
}
