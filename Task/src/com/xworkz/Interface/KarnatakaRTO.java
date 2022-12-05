package com.xworkz.Interface;

import com.xworkz.Interface.Rules.TransportRules;

public interface KarnatakaRTO extends TransportRules{

	@Override
	default boolean paidTax(double amount) {
       System.out.println("running paidTax");
       System.out.println(amount);
       return false;
	}

	@Override
	default double gst() {
	       System.out.println("running gst");	
		return 0;
	}
      
	
}
