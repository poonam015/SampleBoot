package com.example.demo;

public class Mobile {
	
	private int MobileId;
	private String MobileName;
	private String MobileCompany;
	private int MobilePrice;
	public Mobile(int mobileId, String mobileName, String mobileCompany, int mobilePrice) {
		super();
		MobileId = mobileId;
		MobileName = mobileName;
		MobileCompany = mobileCompany;
		MobilePrice = mobilePrice;
	}
	public int getMobileId() {
		return MobileId;
	}
	public void setMobileId(int mobileId) {
		MobileId = mobileId;
	}
	public String getMobileName() {
		return MobileName;
	}
	public void setMobileName(String mobileName) {
		MobileName = mobileName;
	}
	public String getMobileCompany() {
		return MobileCompany;
	}
	public void setMobileCompany(String mobileCompany) {
		MobileCompany = mobileCompany;
	}
	public int getMobilePrice() {
		return MobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		MobilePrice = mobilePrice;
	}
	@Override
	public String toString() {
		return "Mobile [MobileId=" + MobileId + ", MobileName=" + MobileName + ", MobileCompany=" + MobileCompany
				+ ", MobilePrice=" + MobilePrice + "]";
	}
	
	

}
