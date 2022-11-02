package com.xworkz.package2;

import com.xworkz.package1.task.ModifyPhotoFrame;
import com.xworkz.package1.task.PhotoFrame;

public class PhotoFrameRunner {

	public static void main(String[] args) {
     
		PhotoFrame photo=new PhotoFrame();
		
		System.out.println("--------------old values-------------");
		System.out.println(photo.getBrand());
		System.out.println(photo.getMaterial());
		System.out.println(photo.getWeight());
		System.out.println(photo.getColour());
		System.out.println(photo.getPrice());
		System.out.println(photo.isQuality());
		System.out.println(photo.getQuantity());
		System.out.println(photo.getMountingType());
		System.out.println(photo.isDamage());
		System.out.println(photo.getSize());
		System.out.println(photo.getShape());
		
		ModifyPhotoFrame modify=new ModifyPhotoFrame();
		modify.ModifyFrame(photo);
	}

}
