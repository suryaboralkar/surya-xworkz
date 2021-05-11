package com.xworkz.xworkzapp.matrimony;

import com.xworkz.xworkzapp.num.Gender;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MatriDTO {
	private int id;
	private String mName;
	private Gender mGender;
	private String mQualities;
	private String mQualification;

}
