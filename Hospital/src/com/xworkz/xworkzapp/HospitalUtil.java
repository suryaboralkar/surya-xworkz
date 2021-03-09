package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.hospital.AdmitCard;
import com.xworkz.xworkzapp.hospital.Hospital;

public class HospitalUtil {

	public static void main(String[] args) {
		Hospital hsp=new Hospital();
		hsp.fees=500;
		
		
		
		
		AdmitCard admitCard=new AdmitCard("luci",25);
		admitCard.displayInfo();
		hsp.allow(admitCard);
		
	}

}
