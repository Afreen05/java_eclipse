package com.xworkz.package1.task;

public class ModifyNovel {
    
	public void modifyNovel(Novel novel) {
		
		novel.setBookName("The girl in room 105");
		System.out.println(novel.getBookName());
		novel.setPrice(150);
		System.out.println(novel.getPrice());
		novel.setLanguage("English");
		System.out.println(novel.getLanguage());
		novel.setWriter("ChetanBhagat");
		System.out.println(novel.getWriter());
		novel.setBookQuality(true);
		System.out.println(novel.isBookQuality());
		novel.setNoOfPages(500);
		System.out.println(novel.getNoOfPages());
		novel.setNoOfchapters(20);
		System.out.println(novel.getNoOfchapters());
		novel.setIntresting(true);
		System.out.println(novel.isIntresting());
		novel.setTypeOfNovel("thrillers");
		System.out.println(novel.getBookName());
		novel.setReleasedYear(2015);
		System.out.println(novel.getReleasedYear());
		
	}
}
