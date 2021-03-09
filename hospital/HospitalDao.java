package com.xworkz.xworkzapp.student.hospital;

public interface HospitalDao {
	public void add(HospitalDto dto);
	public void display();
	public void update(String name,String phoneNo);
	public void display(String name,String location);
	public void delete(String name);

}
