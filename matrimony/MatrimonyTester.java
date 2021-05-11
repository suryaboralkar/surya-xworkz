package com.xworkz.xworkzapp.matrimony;

import java.sql.SQLException;

import com.xworkz.xworkzapp.num.Gender;

public class MatrimonyTester {

	public static void main(String[] args) throws SQLException {
           MatriDTO dto = new MatriDTO();
	
	dto.setId(1);
	dto.setMGender(Gender.M);
	dto.setMQualities("active,punctual");
	dto.setMQualification("should be educated");
	dto.setMName("surya");
	
		MatriDAO impli = new DaoImpli();
		//impli.save(dto);
		impli.fetchByName("surya");
	    impli.fetchById(1);
		impli.updatequalitiesByName("active and panctual","prakash");
		impli.fetchByNameAndQualification("prakash", "graduated");
		//impli.fetchByIdAndGender(1,Gender.M);
		//impli.deleteByNamegenderAndQualification("prakash", Gender.M, "should be educated");*********
		//impli.fetchByGenderAndName("prakash", Gender.M);*****************
		
		
     
	}

}
