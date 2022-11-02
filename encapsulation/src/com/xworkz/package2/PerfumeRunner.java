package com.xworkz.package2;
import com.xworkz.package1.task.Perfume;
import com.xworkz.package1.task.PerfumeModify;

public class PerfumeRunner {

	public static void main(String[] args) {
       
		Perfume perfume=new Perfume();
		
		System.out.println("--------------old values-------------");
		System.out.println(perfume.getBrand());
		System.out.println(perfume.getName());
		System.out.println(perfume.getBrandOwner());
		System.out.println(perfume.getColour());
		System.out.println(perfume.getPrice());
		System.out.println(perfume.isQuality());
		System.out.println(perfume.getQuantity());
		System.out.println(perfume.getManufactureDate());
		System.out.println(perfume.getManufactureCountry());
		System.out.println(perfume.getExpiryDate());
		System.out.println(perfume.getFragrance());
		
		System.out.println("----------------Modified values------------------");
		PerfumeModify modify = new PerfumeModify();
		modify.usePerfume(perfume);
		
	}

}
