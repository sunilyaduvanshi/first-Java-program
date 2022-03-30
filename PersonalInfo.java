package com.spring.com;
public class PersonalInfo {
	private String aadharCard;
	private String panNo; 
	private String emailid;
	private Address address;
	public PersonalInfo() {
		super();
	}
	public PersonalInfo(String aadharCard, String panNo, String emailid,Address address) {
		super();
		this.aadharCard = aadharCard;
		this.panNo = panNo;
		this.emailid = emailid;
		this.address=address;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "PersonalInfo [aadharCard=" + aadharCard + ", panNo=" + panNo + ", emailid=" + emailid + ", address="
				+ address + "]";
	}
	
	
}
