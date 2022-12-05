package com.xworkz.Example;

import com.xworkz.Interface.DevelopmentInstitute;
import com.xworkz.Interface.Institute;
import com.xworkz.Interface.TrainingInstitute;
import com.xworkz.Interface.XworkzRajajiNagar;

public class XworkzRajajiNagarRunner {

		public static void main(String[] args) {
			
			Object obj=new XworkzRajajiNagar();
			obj.equals(obj);
			obj.getClass();
			obj.hashCode();
			obj.notify();
			obj.notifyAll();
			obj.toString();
			
			Institute inst=new XworkzRajajiNagar();
			inst.placement();
			inst.training();
			inst.equals(obj);
			inst.getClass();
			inst.hashCode();
			inst.notify();
			inst.notifyAll();
			inst.placement();
			inst.toString();
			inst.training();
			
			DevelopmentInstitute devop=new XworkzRajajiNagar();
			devop.interview();
			
			TrainingInstitute testing = new XworkzRajajiNagar();
			testing.interview();
			
			XworkzRajajiNagar rajajinagar=new XworkzRajajiNagar();
			rajajinagar.interview();
			rajajinagar.placement();
			rajajinagar.training();
			
			
			
			
		}

	}


