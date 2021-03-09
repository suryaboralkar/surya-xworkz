package com.xworkz.xworkzapp.student.hospital;

public interface HospitalServices {
public boolean isValidate(HospitalDto dto);
public void checkDisplayDetails(String name,String location);
public void checkDisplayDetails();
public void checkUpdateDetails(String name,String phoneNo);
public void checkDeletDetails(String name);
}
