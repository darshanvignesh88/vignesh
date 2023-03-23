package org.company;

public class CompanyInfo {

	private void companyName() {
	
		System.out.println("Company Name - TCS");
	}
	private void companyId(){
		
		System.out.println("Company ID - TCS123");
	}
	private void companyAddress() {
		
		System.out.println("Company Address - Thoraipakkam,chennai");
	}
	
	public static void main(String[] args) {
		CompanyInfo a=new CompanyInfo();
		a.companyName();
		a.companyId();
		a.companyAddress();
	}
			
}
