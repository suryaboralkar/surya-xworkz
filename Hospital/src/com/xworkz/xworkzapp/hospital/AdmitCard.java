package com.xworkz.xworkzapp.hospital;

public class AdmitCard {
	public String patientName;
	public int age;
	
	public  AdmitCard(String patientName,int age)
	{
		super();
		this.age=age;
		this.patientName=patientName;
	}
	public void displayInfo()
	{
		System.out.println(this.patientName+" "+this.age);
	}
	public String getPatientName() {
		return patientName;
	}
	public int getage() {
		return age;
	}

}
