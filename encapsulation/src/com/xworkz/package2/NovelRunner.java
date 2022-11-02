package com.xworkz.package2;

import com.xworkz.package1.task.ModifyNovel;
import com.xworkz.package1.task.Novel;

public class NovelRunner {

	public static void main(String[] args) {
      
		Novel novel=new Novel();
		
		System.out.println("--------------old values-------------");
		System.out.println(novel.getBookName());
		System.out.println(novel.getWriter());
		System.out.println(novel.getReleasedYear());
		System.out.println(novel.getBookColour());
		System.out.println(novel.getPrice());
		System.out.println(novel.isBookQuality());
		System.out.println(novel.getNoOfPages());
		System.out.println(novel.getNoOfchapters());
		System.out.println(novel.getLanguage());
		System.out.println(novel.isIntresting());
		System.out.println(novel.getTypeOfNovel());
		
		System.out.println("----------------Modified values------------------");
		ModifyNovel modify = new ModifyNovel();
		modify.modifyNovel(novel);
	}

}
