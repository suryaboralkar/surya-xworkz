package com.xworkz.xworkzapp.hospital;

public class Hospital {
	public int fees;
	public AdmitCard admitCard;
	
	public boolean allow(AdmitCard admitCard)
	
	{
		boolean check=false;
				if(this.fees==500)
				{
					check=true;
					if(admitCard !=null)
					{
						this.admitCard=admitCard;
						System.out.println("allowed for treatment");
						
					}
					else
					{
						System.out.println("patient details are missing");
					}
					
				}
				else
				{
					System.out.println("please pay the consultant fees");
				}
				return check;
					
	}

}
