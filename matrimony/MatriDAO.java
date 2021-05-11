package com.xworkz.xworkzapp.matrimony;

import java.sql.SQLException;

import com.xworkz.xworkzapp.num.Gender;

public interface MatriDAO {
	
	public void  save(MatriDTO dto) throws SQLException;
    public  MatriDTO fetchByName(String name) throws SQLException;
    public  MatriDTO fetchById(int id) throws SQLException;
    public void updatequalitiesByName(String qualities,String name) throws SQLException;
    public  MatriDTO fetchByNameAndQualification(String name,String qualification) throws SQLException;
    public  MatriDTO fetchByIdAndGender(int id,Gender gender) throws SQLException;
    public void deleteByNamegenderAndQualification(String name,Gender gender,String qualification) throws SQLException;
    public  MatriDTO fetchByGenderAndName(String name,Gender  gender) throws SQLException;
    public void updateQualificationByNameAndDeletById(int id, String qualification,String name) throws SQLException;


}
