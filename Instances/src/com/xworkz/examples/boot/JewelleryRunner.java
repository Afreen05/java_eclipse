package com.xworkz.examples.boot;

import com.xworkz.examples.Jewellery;

    public class JewelleryRunner {

	public static void main(String[] args) {

		String[] gold = { "ring", "earring", "chain" };
		String[] silver = { "ring", "earring", "chain" };
		String[] diamond = { "ring", "earring", "chain" };
		String[] platinum = { "ring", "earring", "chain" };
		String[] metallic = { "ring", "earring", "chain" };
		String[] oxidized = { "ring", "earring", "chain" };

        Jewellery jewel = new Jewellery("soft", false, 867365l, 55.5f, 's', gold, silver, diamond, platinum, metallic,
				oxidized);
         System.out.println(jewel.type);
         System.out.println(jewel.quality);

         System.out.println(jewel.weight);

         System.out.println(jewel.price);

         System.out.println(jewel.size);


		jewel.display();
	}
}
