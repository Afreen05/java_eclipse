package com.xworkz.String;

public class StringProgram {
        
	public static void main(String[] args) {
		String tripleRide="Triple Riding is a Kannada movie "
				+ "released on 25 Nov, 2022. The movie is directed by Mahesh"
				+ " Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu "
				+ "Kokila and Rangayana Raghu as lead characters";

		
		String[] splitted=tripleRide.split(" ");

		for (int i=0; i < splitted.length; i++)
	    {
	      System.out.println(splitted[i]);
	    }
		System.out.println(System.lineSeparator());

		
		char ch = 'R';
        int number = 0;
          for(int i = 0; i < tripleRide.length(); i++) {
            if(ch == tripleRide.charAt(i)) {
                ++number;
            }
        }

        System.out.println("Number of " + ch + " = " + number);
		System.out.println(System.lineSeparator());

		
        int digits=0;
	    for(int i=0;i<tripleRide.length();i++)
	    {
	      if(Character.isDigit(tripleRide.charAt(i)))
	      digits++;

	    }
	    System.out.println("the number of digits in the given string is:" + digits);
		System.out.println(System.lineSeparator());

        //Split by comma (,) 
        String[] splitByComma=tripleRide.split(",");

		for (int i=0; i < splitByComma.length; i++)
	    {
	      System.out.println(splitByComma[i]);
	    }
		System.out.println(System.lineSeparator());

		
		char[] tripleRideString = tripleRide.toCharArray();

		System.out.println("char array elements:");
		for(int i=0;i<tripleRideString.length;i++) {

			System.out.println(tripleRideString[i]);
		}
		System.out.println(System.lineSeparator());

		
		System.out.println("Reversed string:");
		for(int i=tripleRideString.length-1;i>=0;i--)
		{
   			System.out.print(tripleRideString[i]);
		}

		System.out.println(System.lineSeparator());

		
		String upper_string = tripleRide.toUpperCase();
		System.out.println(upper_string);

		System.out.println(System.lineSeparator());

		
		String lower_string=tripleRide.toLowerCase();
		System.out.println(lower_string);

		
		int count=0;
		System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < tripleRide.length(); i++) {
		   for (int j = i + 1; j < tripleRide.length(); j++) {
		    if (tripleRideString[i] == tripleRideString[j]) {
		     System.out.println(tripleRideString[j]+" ");
		     count++;
		     break;
		    }
		   }
		  }


		  System.out.println(System.lineSeparator());
		  String rev="";
		  for ( int i = tripleRide.length() - 1; i >= 0; i-- )
		         rev = rev + tripleRide.charAt(i);

		  if (tripleRide.equals(rev))
		         System.out.println("String:"+tripleRide+" is a palindrome");
		      else
		         System.out.println("String:"+tripleRide+" is not a palindrome");

	}

}
