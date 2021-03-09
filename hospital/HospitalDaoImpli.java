package com.xworkz.xworkzapp.student.hospital;

public class HospitalDaoImpli implements HospitalDao {
	HospitalDto[] hDto = new HospitalDto[5];
	int index = 0;

	@Override
	public void add(HospitalDto dto) {
		hDto[index] = dto;
		index++;
		System.out.println("data added sucessfully");

	}

	@Override
	public void display() {
		System.out.println("display method");
		for (int i = 0; i < index; i++) {
			if (hDto[i] != null) {
				System.out.println("your licence no. is;" + " " + hDto[i].getLicence());
				System.out.println("your name  is;" + " " + hDto[i].getName());
				System.out.println("your founder  is;" + " " + hDto[i].getFounder());
				System.out.println("your phoneNo no. is;" + " " + hDto[i].getPhoneNo());
				System.out.println("your location is;" + " " + hDto[i].getLocation());
			}
		}

	}

	@Override
	public void update(String name, String phoneNo) {
		System.out.println("inside update method");
		for (int i = 0; i < index; i++) {

			if (hDto[i].getName() == name) {
				hDto[i].setPhoneNo(phoneNo);

			} else
				System.out.println("invalid name ");

		}
	}

	@Override
	public void display(String name, String location) {
		for (int i = 0; i < index; i++) {
			if (hDto[i].getName() == name && hDto[i].getLocation() == location) {
				System.out.println(hDto[i].getName());
				System.out.println(hDto[i].getFounder());
				System.out.println(hDto[i].getLicence());
				System.out.println(hDto[i].getPhoneNo());
			}

		}
	}

	@Override
	public void delete(String name) {
		System.out.println("inside delete method");
		for (int i = 0; i < index; i++) {

			if (hDto[i].getName() == name) {
				hDto[i] = null;

			} else
				System.out.println("invalid  Name");

		}
	}
}