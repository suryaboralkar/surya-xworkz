package com.xworkz.xworkzapp.student.hospital;

public class HospitalTester {
	public static void main(String[] args) {
	HospitalDto	dto=new	HospitalDto("45gt6", "sakara", "devar", "unknown", "98765432");
	HospitalDto	dto1=new	HospitalDto("45gdd", "tadpalikar", "mailoor", "linganna", "98763456");
	HospitalDto	dto2=new	HospitalDto("45gtg", "vimsr", "marathalli", "basheer", "98765u876");
	HospitalDto	dto3=new	HospitalDto("45htt", "manikrao", "pansaltaleem", "manikann", "8767436876");
	
	HospitalServiceImpli impli=new HospitalServiceImpli();
	impli.isValidate(dto);
	
	 impli.isValidate(dto1); impli.isValidate(dto2); impli.isValidate(dto3);
	 
	
	impli.checkDisplayDetails();
	System.out.println(" after display all");
	impli.checkDisplayDetails("vimsr", "marathalli");
	
	impli.checkUpdateDetails("manikrao", "9907436876");
	impli.checkDisplayDetails();
	System.out.println("==--------");
	impli.checkDeletDetails("sakara");
	impli.checkDisplayDetails();
	
	

	
	
	
   
   
     
   
	}

}