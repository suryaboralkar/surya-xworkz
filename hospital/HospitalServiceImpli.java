package com.xworkz.xworkzapp.student.hospital;

public class HospitalServiceImpli implements HospitalServices {
	HospitalDao dao = new HospitalDaoImpli();

	@Override
	public boolean isValidate(HospitalDto dto) {
		boolean isValidate = true;

		if (dto.getName() == null || dto.getName().length() < 5) {

			System.out.println("invalid name");
			isValidate = false;
			return isValidate;

		}

		if (dto.getLicence() == null || dto.getLicence().length() < 5) {
			System.out.println("invalid licence");
			isValidate = false;
			return isValidate;

		}

		if (dto.getFounder() == null || dto.getFounder().length() < 5) {
			System.out.println("founder validity expired");
			isValidate = false;
			return isValidate;

		}
		if (dto.getPhoneNo() == null || dto.getPhoneNo().length() < 5) {
			System.out.println("please give valid phoneNo");
			isValidate = false;
			return isValidate;

		}
		if (isValidate) {
			System.out.println("data added success");
			dao.add(dto);
		}
		return isValidate;

	}

	@Override
	public void checkDisplayDetails() {
		dao.display();
	}

	@Override
	public void checkDisplayDetails(String name, String location) {
		System.out.println("inside display using parameters");
		dao.display(name, location);

	}

	@Override
	public void checkUpdateDetails(String name, String phoneNo) {
		if(name!=null && phoneNo!= null) {
			dao.update(name, phoneNo);
			
		}
		
	}

	@Override
	public void checkDeletDetails(String name) {
	 if(name!=null)
	 {
		 dao.delete(name);
	 }
		
	}

}
