package com.xworkz.examples.boot;

import com.xworkz.examples.Diary;

public class DiaryRunner {

	public static void main(String[] args) {
		
		int[] quantity= {32,43,53};
		String[] iceCreams= {"amul","arun","craembell"};
		String[] coldDrinks= {"pepsi","7up","mirinda"};
		String[] chocolates= {"diaryMilk","milkybar"};
		String[] cakes= {"chocolate","vanilla"};
		
		Diary diary=new Diary("nandini","rajaji Nagar",25000l,746535l,true,quantity,iceCreams,coldDrinks,chocolates,cakes);
		System.out.println(diary.branch);
		System.out.println(diary.area_name);
		System.out.println(diary.total_milk_packets);
		System.out.println(diary.total_curd_packets);
		System.out.println(diary.quality);
		
		
		diary.display();

	}

}
